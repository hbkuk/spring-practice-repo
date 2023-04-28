package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList( @RequestParam(value="searchCondition", defaultValue = "TITLE", required=false) String condition,
								@RequestParam(value="searchKeyword", defaultValue = "", required=false) String keyword,
								BoardVO vo, BoardDAO boardDao, Model model ) {
		System.out.println( "검색 조건 : " + condition );
		System.out.println( "검색 단어 : " + keyword );
		model.addAttribute("boardList", boardDao.getBoardList(vo));
		return "getBoardList.jsp";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		model.addAttribute("board", boardDAO.getBoard(vo));
		return "getBoard.jsp";
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
