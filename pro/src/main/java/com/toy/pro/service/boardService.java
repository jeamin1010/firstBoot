package com.toy.pro.service;

import com.toy.pro.domain.boardDTO;
import com.toy.pro.repository.boardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class boardService {
    private final boardDAO boardDao;

    public int boardCount(){
        return boardDao.boardCount();
    }
    public List<boardDTO> boardList(){
        return boardDao.selectAll();
    }
    public boardDTO detail(int seq){
        return boardDao.selectDetail(seq);
    }

}
