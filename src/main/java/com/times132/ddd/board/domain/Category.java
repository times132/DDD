package com.times132.ddd.board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {

    FREE("자유게시판"), TIP("팁게시판");

    private final String name;
}
