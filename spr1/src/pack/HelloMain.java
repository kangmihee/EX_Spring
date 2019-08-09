package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		System.out.println("성공");
		
		Message1 message1 = new Message1();
		message1.sayHello("tom");
		
		Message2 message2 = new Message2();
		message2.sayHello("maria");
		
		MessageInter inter;
		inter = message1;
		inter.sayHello("james");
		
		MessageInter inter2;
		inter2 = message2;
		inter2.sayHello("반가워");
		
		System.out.println();
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter1 = (MessageInter)context.getBean("mes1"); // id 값 넣어준다.
		inter1.sayHello("oscar");
		
	}
}
