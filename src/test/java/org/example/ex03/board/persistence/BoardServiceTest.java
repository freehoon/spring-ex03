package org.example.ex03.board.persistence;

import lombok.Setter;
import org.example.ex03.board.service.BoardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*Context.xml"})
@PropertySource("classpath:properties/database_properties.xml")
public class BoardServiceTest {
    @Setter(onMethod_ = @Autowired)
    private BoardService boardService;

    @Test
    public void testGetTimeMapper() {
        System.out.println("BoardService 테스트");
        System.out.println(boardService.getTime());

        System.out.println("BoardService 테스트2");
        System.out.println(boardService.getTime2());
    }
}
