package com.siki.httptwo;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
        uploadFileDemo();
    }

    public static void simpleGetRequest() throws URISyntaxException, IOException, InterruptedException, NoSuchAlgorithmException {
        HttpClient client = HttpClient.newHttpClient();
        Authenticator authenticator = new Authenticator() {
        };
        HttpClient client2 = HttpClient.newBuilder()
                .authenticator(authenticator)
                .sslContext(SSLContext.getDefault())
                .sslParameters(new SSLParameters())
                .proxy(ProxySelector.getDefault())
                .executor(Executors.newCachedThreadPool())
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .cookieManager(new CookieManager())
                .version(HttpClient.Version.HTTP_2)
                .build();
        HttpResponse<String> response = client.send(
                HttpRequest.newBuilder(new URI("https://www.baidu.com/")).GET().build(),
                HttpResponse.BodyHandler.asString()
        );
        int statusCode = response.statusCode();
        String responseStr = response.body().toString();
        System.out.println(statusCode+"============="+responseStr);
    }

    public static void downloadFile() throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://www.baidu.com/"))
                .GET()
                .build();
        Path tempFile = Files.createTempFile("template_file",".html");
        HttpResponse<Path> response = client.send(request,HttpResponse.BodyHandler.asFile(tempFile));
        int statusCode = response.statusCode();
        String body = response.body().toString();
        System.out.println(statusCode + "------->"+body );

    }

    public static void simplePostRequest() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:8080/testPost"))
                .header("Content-type","application/json")
                .POST(HttpRequest.BodyProcessor.fromString("{\"name\":\"test\",\"pass\":\"abc\"}"))
                .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandler.asString());
        int statusCode = response.statusCode();
        String body = response.body().toString();
        System.out.println(statusCode+"-----------"+body);
    }

    public static void uploadFileDemo() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://localhost:8080/testUpload"))
                .POST(HttpRequest.BodyProcessor.fromFile(Paths.get("C:\\Users\\JIANGG~1\\AppData\\Local\\Temp\\template_file15245378316125002302.html")))
                .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandler.asString());
        System.out.println(response.statusCode());
    }



}
