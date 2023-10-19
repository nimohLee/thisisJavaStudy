package ch15.sec09;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> boardList;

    public BoardDao() {
        boardList = new ArrayList<>();
        boardList.add(new Board("제목2", "내용2"));
        boardList.add(new Board("제목3", "내용3"));
    }


    public List<Board> getBoardList() {
        return boardList;
    }
}
