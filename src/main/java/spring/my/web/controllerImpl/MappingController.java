package spring.my.web.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MappingController {

	public MappingController() {

	}

	@RequestMapping(value = "/signinup.do")
	public String signinupRedirect() {
		return "signinup";
	}
	
	@RequestMapping(value = "/signup.do")
	public String signupRedirect() {
		return "signup";
	}
}
