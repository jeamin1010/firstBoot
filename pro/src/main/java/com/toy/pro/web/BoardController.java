package com.toy.pro.web;

import com.toy.pro.domain.boardDTO;
import com.toy.pro.repository.boardDAO;
import com.toy.pro.service.boardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {

    @Autowired
    boardService service = null;

    @RequestMapping(value = "board.do", method = RequestMethod.GET)
    public String boardSeq(boardDTO board, Model model) throws Exception{
        System.out.println("boardJSP TEST");
        model.addAttribute("boardList", service.boardList());
        return "/WEB-INF/views/board.jsp";
    }

    @RequestMapping(value = "list.do", method = RequestMethod.GET)
    public String boardList(Model model) throws Exception{
        model.addAttribute("boardList", service.boardList());

        return "/WEB-INF/views/boardList.jsp";
    }


}
