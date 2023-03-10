package idk.Section_2.controllers;

import idk.Section_2.services.GreetingService;
import idk.Section_2.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    @BeforeEach
    void SetUp(){
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();

    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}