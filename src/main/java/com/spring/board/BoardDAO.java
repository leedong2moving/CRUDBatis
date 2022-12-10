package com.spring.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    SqlSession sqlSession;

    public int  insertBoard(BoardVO vo){
        int result = sqlSession.insert("Board.insertBoard", vo);
        return result;
    }
    public int updateBoard(BoardVO vo){
        int update =sqlSession.update("Board.updateBoard",vo);
        return update;
    }
    public int deleteBoard(BoardVO vo){
        int delete =sqlSession.delete("Board.deleteBoard",vo);
        return delete;
    }
    public BoardVO getBoard(int seq){
        BoardVO one = sqlSession.selectOne("Board.getBoard",seq);
        return one;
    }
    public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }
}
