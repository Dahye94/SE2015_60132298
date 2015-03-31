import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Professor professor = new Professor("choi");
		//Lecture lecture1 = new Lecture("소프트웨어 공학");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		EGwamok gwamok = (EGwamok)factory.getBean("gwamok");
		CGwamokManager gwamokManager = (CGwamokManager)factory.getBean("gwamokManager");
		
		gwamokManager.gaesol(gwamok);
		

	
	
	}

}
