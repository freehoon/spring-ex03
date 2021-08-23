package org.example.ex03.board.service;

import lombok.AllArgsConstructor;
import org.example.ex03.board.mappers.BoardMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

    private BoardMapper boardMapper;

    @Override
    public String getTime() {
        String time = boardMapper.getTime();
        return time;
    }

    @Override
    public String getTime2(){
        String time = boardMapper.getTime2();
        return time;
    }
}
