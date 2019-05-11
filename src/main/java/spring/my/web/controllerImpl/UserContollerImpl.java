package spring.my.web.controllerImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.my.web.controller.UserController;
import spring.my.web.service.UserService;
import spring.my.web.vo.UserVO;

@Controller
public class UserContollerImpl implements UserController {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Resource(name = "userService")
	private UserService us;

	public UserContollerImpl() {

	}

	@Override
	@RequestMapping(value = "/insertuser.do", method = RequestMethod.POST)
	public String insertUser(@ModelAttribute UserVO uv) {
		String encryptPwd = passwordEncoder.encode(uv.getUserPassword());
		uv.setUserPassword(encryptPwd);
		int result = us.insertUser(uv);
		if (result > 0) {
			System.out.println("가입완료");
		} else
			System.out.println("가입실패");
		return null;
	}

	@Override
	@RequestMapping(value = "/signin.do")
	public ModelAndView login(@RequestParam String userId, @RequestParam String userPassword,
			HttpServletRequest request) {
		UserVO uv = new UserVO();
		uv.setUserId(userId);
		uv = us.login(uv);

		ModelAndView model = new ModelAndView();
		if (uv != null) {
			if (passwordEncoder.matches(userPassword, uv.getUserPassword())) {
				HttpSession session = request.getSession();
				session.setAttribute("user", uv);
				model.setViewName("signinsuccess");
			} else {
				model.setViewName("signinfail");
			}
		} else {
			model.setViewName("signinfail");
		}
		return model;
	}

	@Override
	@RequestMapping(value = "/logout.do")
	public String logout(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		UserVO uv = (UserVO) session.getAttribute("user");
		if (uv != null) {
			session.invalidate();
			return "redirect:/";
		} else {
			return "logoutfail";
		}

	}

}
