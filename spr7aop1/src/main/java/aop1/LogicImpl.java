package aop1;

public class LogicImpl implements LogicInter{
	private ArticleInter articleInter;
	
	public LogicImpl(ArticleInter articleInter) {
		this.articleInter = articleInter;
	}
	
	public void selectData_process() {
		System.out.println("selectData_process 수행");
		articleInter.selectAll();
	}
}
