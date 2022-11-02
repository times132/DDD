package com.times132.ddd.board.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardTest {

    @Test
    @DisplayName("Board props 생성")
    void boardprops_생성() {
        Board.BoardProps boardProps1 = Board.BoardProps.builder()
                .content(null)
                .title(null)
                .build();
        assertNotNull(boardProps1);
    }

    @Test
    @DisplayName("Board 생성")
    void board_생성() {
        Board.BoardProps boardProps1 = Board.BoardProps.builder()
                .content(null)
                .title(null)
                .build();
        Board board = Board.create(boardProps1, 1L);
        assertNotNull(board);
        assertEquals(1L, board.getId());
    }
}
