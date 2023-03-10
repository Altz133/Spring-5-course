package idk.Section_2.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello");
        return "hi";
    }


}
