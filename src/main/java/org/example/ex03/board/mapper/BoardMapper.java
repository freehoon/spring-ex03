package org.example.ex03.board.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public String getTime();
}
