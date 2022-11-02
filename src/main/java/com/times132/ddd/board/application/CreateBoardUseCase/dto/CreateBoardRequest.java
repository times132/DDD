package com.times132.ddd.board.application.CreateBoardUseCase.dto;

import com.times132.ddd.board.domain.Category;

import javax.validation.constraints.NotNull;

public class CreateBoardRequest {
    @NotNull
    private Category category;
    private String title;
    private String content;
    private Long userId;
}
