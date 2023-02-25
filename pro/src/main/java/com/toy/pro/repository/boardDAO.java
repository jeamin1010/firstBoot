package com.toy.pro.repository;

import com.toy.pro.domain.boardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface boardDAO {
    //dao
    List<boardDTO> selectAll(); // 전체글
    int boardCount();// 글 개수
    boardDTO selectDetail(int seq);// 상세글


}
