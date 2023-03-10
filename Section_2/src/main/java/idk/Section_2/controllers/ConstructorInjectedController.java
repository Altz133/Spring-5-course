package idk.Section_2.controllers;

import idk.Section_2.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;

    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
