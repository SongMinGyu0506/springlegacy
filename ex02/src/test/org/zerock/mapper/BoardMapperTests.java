package org.zerock.mapper;


import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
    @Setter(onMethod_ = @Autowired)
    private BoardMapper boardmapper;

    @Test
    public void testGetList() {
        boardmapper.getList().forEach(board -> log.info(board));
    }

    @Test
    public void testInsert() {
        BoardVO board = new BoardVO();
        board.setTitle("new title");
        board.setContent("New Content");
        board.setWriter("new Writer");

        boardmapper.insert(board);

        log.info(board);
    }

    @Test
    public void testRead() {
        BoardVO board = boardmapper.read(5);
        log.info(board);
    }

    @Test
    public void testDelete() {
        log.info("DELETE COUNT : "+ boardmapper.delete(6));
    }

    @Test
    public void testUpdate() {
        BoardVO boardVO = new BoardVO();
        boardVO.setBno(5);
        boardVO.setTitle("Modify title");
        boardVO.setContent("Modify Content");
        boardVO.setWriter("Modify Writer");

        int count = boardmapper.update(boardVO);
        log.info("UPDATE COUNT:" + count);
    }
}
