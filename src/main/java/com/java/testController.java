package com.java;

//developed by TT reviewed by anand...20/09/20.20.20
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controlle");
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView index() {
		 ModelAndView mav = new ModelAndView("Welcome");  
		    return mav; 
	
	}
	
	@RequestMapping("/")
	public String getFirstPage()
	{
		return "hello";
	}
}
