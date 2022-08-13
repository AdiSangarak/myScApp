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

		HelloSpring obj = (HelloSpring) context.getBean("helloWorld");
		obj.getMessage();

	}
	
	private static void xmlBeanFactoryTest() {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("src/Beans.xml"));

		HelloSpring obj = (HelloSpring) factory.getBean("helloWorld");
		obj.getMessage();

	} 
	
	private static void fileSystemXmlApplicationContextTest() {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src/Beans.xml");

		HelloSpring obj = (HelloSpring) context.getBean("helloWorld");
		obj.getMessage();

	} 

}
