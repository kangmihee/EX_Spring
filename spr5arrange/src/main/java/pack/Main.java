package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pack/myinit.xml"); // 경로 같은곳에 없으면 경로지정가능
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:myinit.xml"); 
		
		MessageImpl impl = (MessageImpl)context.getBean("mbean");
		impl.sayHi();
		
		MessageImpl impl2 = (MessageImpl)context.getBean("mbean");
		impl2.sayHi();
		System.out.println("주소는   "+ impl + " " + impl2); // 주소는 같게 나온다. (scope가 singleton일 경우에는 주소는 같음 = String에서의 기본값)
				
		System.out.println("-------------");
		//MessageInter inter = (MessageImpl)context.getBean("mbean");
		//MessageInter inter = (MessageInter)context.getBean("mbean");    
		MessageInter inter = context.getBean("mbean", MessageInter.class); // casting 방법은 2가지
		
		
		inter.sayHi();		
		
	}
}
