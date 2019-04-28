package spring.my.web.controllerImpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/insertuser.do", method = { RequestMethod.POST })
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

}
