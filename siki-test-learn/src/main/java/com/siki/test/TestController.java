package com.siki.test;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
public class TestController {

    @PostMapping(value = "/testPost")
    public String testPost(@RequestBody Test test) throws IOException {
        System.out.println(test.name+"---------"+test.getPass());
//        Test test1 = new Test();
//        ObjectMapper mapper = new ObjectMapper();
//        String s = mapper.writeValueAsString(test1);
//        Test test2 = mapper.readValue(s, Test.class);
        return "sucess";

    }

    @PostMapping(value = "/testUpload")
    public String testUploadFile(HttpServletRequest request) throws IOException {
        BufferedReader reader = request.getReader();
        String str = "" , str2 = "";
        while ((str = reader.readLine())!= null){
            str2 += str;
        }
        System.out.println(str2);
        return "success";
    }
}
