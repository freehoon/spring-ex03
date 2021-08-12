package org.example.ex03.board.service;

import lombok.Setter;
import org.example.ex03.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

    @Setter(onMethod_ = @Autowired)
    private BoardMapper boardMapper;

    @Override
    public String getTime() {
        String time = boardMapper.getTime();
        return time;
    }
}
