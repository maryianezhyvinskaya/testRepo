package by.grodno.auto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class PingController {

//        private int counter = 5;
//
//    private List<Map<String, String>> messages = new ArrayList<Map<String, String>>(){
//        {
//            add(new HashMap<String, String>() {{put("id", "1"); put("text", "first message");}});
//            add(new HashMap<String, String>() {{put("id", "2"); put("text", "second message");}});
//            add(new HashMap<String, String>() {{put("id", "3"); put("text", "third message");}});
//            add(new HashMap<String, String>() {{put("id", "4"); put("text", "end message");}});
//            add(new HashMap<String, String>() {{put("id", "5"); put("text", "end message");}});
//
//        }
//    };

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }


}
