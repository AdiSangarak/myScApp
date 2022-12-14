package in.adi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class MainAppLo4J {
	
	   static Logger log = Logger.getLogger(MainAppLo4J.class.getName());

	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      log.info("Going to create HelloWord Obj");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

	      obj.getMessage();

	      log.info("Exiting the program");
	   }

}
