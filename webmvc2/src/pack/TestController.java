package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


//public class TestController implements Controller{
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String msg = "모델로부터 자료를 읽음";
//		ModelAndView andView = new ModelAndView();
//		andView.addObject("say", "msg");
//		andView.setViewName("list");
//		return andView;
//	}
//}


//annotation 사용 방법
@org.springframework.stereotype.Controller
public class TestController{
	@RequestMapping("index.do")
	public ModelAndView abc() {
		String msg = "모델로부터 자료를 읽음";
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("say", msg); // key, value 값을 넘김
		andView.setViewName("list");  // client로 넘기는 것이아니라  forwording방법으로 넘김
		
		return andView;	
	}
}


