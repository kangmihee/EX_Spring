package spr6anno;

import org.springframework.stereotype.Component;

@Component // --> 자기 스스로 객체를 만들어냄
//@Component("sender1")
public class Sender1 implements SenderInter{
	public void show() {
		System.out.println("Sender1 처리");
	}

}
