package in.adi;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainAppContextTests {

	public static void main(String[] args) {

		applicationContextTest();
		xmlBeanFactoryTest();
		fileSystemXmlApplicationContextTest();

	}

	private static void applicationContextTest() {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

	}
	
	private static void xmlBeanFactoryTest() {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();

	} 
	
	private static void fileSystemXmlApplicationContextTest() {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:/GitHubRepository/tutorialspoint_spring/TutorialsPoint_HelloSpring/src/Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

	} 

}
