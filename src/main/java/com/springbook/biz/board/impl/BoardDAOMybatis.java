package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis extends SqlSessionDaoSupport {
	
	@Autowired
	public void setSqlSessionFactory( SqlSessionFactory sessionFactory ) {
		super.setSqlSessionFactory(sessionFactory);
	}
	
	public void insertBoard(BoardVO vo) {
		System.out.println("Mybatis inserBoard() 처리");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("Mybatis updateBoard() 처리");
		getSqlSession().update("BoardDAO.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("Mybatis deleteBoard() 처리");
		getSqlSession().delete("BoardDAO.deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("Mybatis getBoard() 처리");
		return getSqlSession().selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("Mybatis getBoardList() 처리");
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
	}
}
