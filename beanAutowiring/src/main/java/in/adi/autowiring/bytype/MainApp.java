package in.adi.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		TextEditor te = (TextEditor) context.getBean("textEditorByType");

		te.spellCheck();
	}

}
