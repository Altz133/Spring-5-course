package idk.Section_2;

import idk.Section_2.controllers.ConstructorInjectedController;
import idk.Section_2.controllers.MyController;
import idk.Section_2.controllers.PropertyInjectedController;
import idk.Section_2.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Section2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Section2Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		System.out.flush();
//		Examples of injecting a controller. The best way is to inject it via contructor
		System.out.println("------------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------------setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------------constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
