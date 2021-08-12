package org.example.ex03.board.controller;

import org.example.ex03.board.vo.BoardVO;
import org.example.ex03.board.vo.SearchVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @RequestMapping("/")
    public String indexPage(@ModelAttribute("searchVO") SearchVO searchVO,
                            @ModelAttribute("boardVO") BoardVO boardVO,
                            Model model){

        System.out.println("index page");
        return "boardList";
    }

    @RequestMapping("/formPage")
    public String formPage(@ModelAttribute("searchVO") SearchVO searchVO,
                           @ModelAttribute("boardVO") BoardVO boardVO,
                           Model model){
        System.out.println("form page");

        return "boardForm";
    }
}
