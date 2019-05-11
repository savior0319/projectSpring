package spring.my.web.service;

import spring.my.web.vo.UserVO;

public interface UserService {

	public int insertUser(UserVO uv);

	public UserVO login(UserVO uv);

}
