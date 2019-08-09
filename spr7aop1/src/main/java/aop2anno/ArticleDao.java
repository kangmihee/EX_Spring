package aop2anno;

import org.springframework.stereotype.Repository;

@Repository // 이것을 하면 자체적으로 new할 수 있음
// 가독성을 위해서 사용
public class ArticleDao implements ArticleInter{
	public void selectAll() {
		System.out.println("db 자료 읽기 성공");
	}
}
