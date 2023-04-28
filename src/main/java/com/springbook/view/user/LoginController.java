package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController{
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET )
	public String loginView() {
		System.out.println("로그인 화면으로 이동");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST )
	public String login(UserVO vo, UserDAO userDao, HttpSession session) {
		UserVO user = userDao.getUser(vo);
		if( user != null ) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}
		return "login.jsp";
	}
}