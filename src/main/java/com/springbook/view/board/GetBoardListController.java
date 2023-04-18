package com.springbook.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class GetBoardListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("글 목록 검색");
		
		BoardVO vo = new BoardVO();
		BoardDAO boardDao = new BoardDAO();
		List<BoardVO> boardList = boardDao.getBoardList(vo);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList);
		mav.setViewName("getBoardList");
		return mav;
		
	}

}
