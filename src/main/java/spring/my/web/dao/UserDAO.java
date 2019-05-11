package spring.my.web.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import spring.my.web.vo.UserVO;

@Repository(value = "userDAO")
public class UserDAO {

	public UserDAO() {
	}

	public int insertUser(SqlSessionTemplate session, UserVO uv) {
		return session.insert("user.insertUser", uv);
	}

	public UserVO selectLogin(SqlSessionTemplate session, UserVO uv) {
		return session.selectOne("user.selectLogin", uv);
	}

}
