package spring.my.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import spring.my.web.vo.UserVO;

public interface UserController {

	public String insertUser(UserVO uv);

	public ModelAndView login(String userId, String userPassword, HttpServletRequest request);

	public String logout(HttpServletRequest request);

}
