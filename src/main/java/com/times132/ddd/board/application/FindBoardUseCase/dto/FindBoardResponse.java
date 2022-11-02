package com.times132.ddd.board.application.FindBoardUseCase.dto;

import com.times132.ddd.board.domain.Board;
import com.times132.ddd.common.application.CommonResponse;
import org.springframework.http.HttpStatus;

public class FindBoardResponse extends CommonResponse<Board> {
    public FindBoardResponse(Board body, HttpStatus status) {
        super(body, status);
    }
}
