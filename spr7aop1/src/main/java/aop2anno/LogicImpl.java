package aop2anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //비지니스 로직을 운영하고 있으니까 service를 썼음
public class LogicImpl implements LogicInter{
	@Autowired // 타입에 의한 매핑 : @Autowired
	@Qualifier("articleDao") // 이름에 의한 매핑 : @Qualifier
	private ArticleInter articleInter;
	/*
	public LogicImpl(ArticleInter articleInter) {
		this.articleInter = articleInter;
	}
	*/
	public void selectData_process() {
		System.out.println("selectData_process 수행");
		articleInter.selectAll();
	}
}
