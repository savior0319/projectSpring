package spring.my.web.serviceImpl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.my.web.dao.UserDAO;
import spring.my.web.service.UserService;
import spring.my.web.vo.UserVO;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private SqlSessionTemplate session;

	@Resource(name = "userDAO")
	private UserDAO ud;

	@Override
	public int insertUser(UserVO uv) {
		return ud.insertUser(session, uv);
	}

}
