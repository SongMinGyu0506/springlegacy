package org.zerock.service;

import org.zerock.domain.BoardVO;

import java.util.List;

public interface BoardService {
    public void register(BoardVO board);
    public BoardVO get(int bno);
    public boolean modify(BoardVO board);
    public boolean remove(int bno);
    public List<BoardVO> getList();
}
