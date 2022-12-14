package in.adi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		beanScopeSingleton();
		beanScopePrototype();

	}

	private static void beanScopeSingleton() {
		System.out.println("#######################################################");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.setMessage("I'm object A");
		objA.getMessage();

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();

	}
	
	private static void beanScopePrototype() {
		System.out.println("#######################################################");
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansPrototype.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.setMessage("I'm object A");
		objA.getMessage();

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();

	}

}
