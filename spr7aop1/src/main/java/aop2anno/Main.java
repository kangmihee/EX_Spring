package aop2anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:init2.xml");
		
		LogicInter inter = (LogicInter)context.getBean("logicImpl");
		inter.selectData_process();
	}
}
