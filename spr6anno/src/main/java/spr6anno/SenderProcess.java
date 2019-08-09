package spr6anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component // 스스로 new한 것
@Service // 비지니스로직을 수행하는 객체 생성 
//@Service("senderProcess")
public class SenderProcess {
	@Autowired // --> 밑에 있는(주석부분)것을 동등하게 행동함 , 객체변수가 1개 이면 @Autowired사용
	@Qualifier("sender2")// senderInter 타입의 객체변수가 2개 이면 사용하는 방식.
	// sender2의 객체를 찾아서 주소를 매핑 : @Qualifier
	private SenderInter inter;
	
//	public void setInter(SenderInter inter) {
//		this.inter = inter;
//	}
	
	public void ShowData() {
		inter.show();
	}
}

