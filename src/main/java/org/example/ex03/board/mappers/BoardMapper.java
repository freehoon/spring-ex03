package org.example.ex03.board.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
    public String getTime();

    @Select("SELECT sysdate()")
    public String getTime2();
}
