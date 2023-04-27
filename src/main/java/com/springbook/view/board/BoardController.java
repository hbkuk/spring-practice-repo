package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDao, ModelAndView mav ) {
		mav.addObject("boardList", boardDao.getBoardList(vo));
		mav.setViewName("getBoardList.jsp");
		return mav;
	}
	
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		BoardVO board = boardDAO.getBoard(vo);
		mav.addObject("board", board);
		mav.setViewName("getBoard.jsp");
		return mav;
	}
	
	@RequestMapping("/insertBoard.do")
	public String insert(BoardVO vo, BoardDAO boradDAO) {
		boradDAO.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updaate(BoardVO vo, BoardDAO boardDAO, ModelAndView mav){
		boardDAO.updateBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	public String delete(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
}
