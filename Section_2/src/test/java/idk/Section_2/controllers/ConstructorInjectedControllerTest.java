package idk.Section_2.controllers;

import idk.Section_2.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    //most preferred method of dependency injection
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller =new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}