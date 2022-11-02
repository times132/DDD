package com.times132.ddd.board.domain;

import com.times132.ddd.common.domain.AggregateRoot;
import lombok.Builder;
import lombok.Getter;

public class Board extends AggregateRoot<Board.BoardProps> {
    @Getter
    @Builder
    public static class BoardProps {
        private Category category;
        private String title;
        private String content;
        private Long userId;
    }

    protected Board(BoardProps object, Long id) {
        super(object, id);
    }

    public static Board create(BoardProps props, Long id) {
        return new Board(props, id);
    }

    public static Board createNew(BoardProps props) {
        return Board.create(props,null);
    }

    public String getTitle() {
        return this.object.getTitle();
    }

    public String getContent() {
        return this.object.getContent();
    }
}
