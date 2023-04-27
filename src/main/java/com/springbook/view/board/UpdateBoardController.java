package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {

	@RequestMapping("/updateBoard.do")
	public String updaate(BoardVO vo, BoardDAO boardDAO, ModelAndView mav){
		boardDAO.updateBoard(vo);
		return "redirect:getBoardList.do";
	}

}
