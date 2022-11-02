package com.times132.ddd.User.infra.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.times132.ddd.board.infra.entity.Board;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Board> boards = new ArrayList<>();

}
