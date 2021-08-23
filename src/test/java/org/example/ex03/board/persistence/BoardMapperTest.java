package org.example.ex03.board.persistence;

import lombok.Setter;
import org.example.ex03.board.mappers.BoardMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*Context.xml"})
@PropertySource("classpath:properties/database_properties.xml")
public class BoardMapperTest {

    @Setter(onMethod_ = @Autowired)
    private BoardMapper boardMapper;

    @Test
    public void testGetTimeMepper() {
        System.out.println(boardMapper.getClass().getName());
        System.out.println(boardMapper.getTime());
    }

}
