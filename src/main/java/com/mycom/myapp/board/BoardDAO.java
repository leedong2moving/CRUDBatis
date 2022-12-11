package com.mycom.myapp.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.sql.SQLException;
import java.sql.ResultSet;

@Repository
public class BoardDAO {

    @Autowired
    SqlSession sqlSession;

    public int  insertBoard(BoardVO vo){
        int result = sqlSession.insert("Board.insertBoard", vo);
        return result;
    }
    public int updateBoard(BoardVO vo){
        int result =sqlSession.update("Board.updateBoard",vo);
        return result;
    }
    public int deleteBoard(Integer vo){
        int result =sqlSession.delete("Board.deleteBoard",vo);
        return result;
    }
    public BoardVO getBoard(int seq){
        BoardVO result = sqlSession.selectOne("Board.getBoard",seq);
        return result;
    }
    public List<BoardVO> getBoardList(){
        List<BoardVO> result = sqlSession.selectList("Board.getBoardList");
        return result;
    }
}
