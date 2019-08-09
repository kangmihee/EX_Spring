package aa.bb.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aa.bb.model.HelloModel;

@Service
@ComponentScan("aa.bb.model") // xml의 component-scan을 여기에서 가능
@Controller
public class HelloController {
	@Autowired
	@Qualifier("helloModel")
	private HelloModel hellomodel;
	
	@RequestMapping("hello")
	public String hi(Model model){
		String result = hellomodel.getGreeting();
		
		model.addAttribute("msg", result); // key, value 
		return "list";
	}

}
