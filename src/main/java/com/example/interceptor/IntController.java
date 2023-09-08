package com.example.interceptor;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/home")
@Controller
public class IntController {

    @GetMapping("/hello")
    public @ResponseBody void hello(){
       System.out.println("hello");
    }
}
