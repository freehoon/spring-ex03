package org.example.ex03.board.controller;

import lombok.AllArgsConstructor;
import org.example.ex03.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @RequestMapping("/getTime")
    public String getTime(Model model){
        model.addAttribute("time", boardService.getTime());
        return "getTime";
    }
}
