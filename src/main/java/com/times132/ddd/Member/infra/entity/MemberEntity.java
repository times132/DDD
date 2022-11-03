package com.times132.ddd.Member.infra.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.times132.ddd.Member.domain.Age;
import com.times132.ddd.Member.domain.Name;
import com.times132.ddd.board.infra.entity.BoardEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "MEMBER")
public class MemberEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    private Name name;

    @Embedded
    private Age age;

    @JsonIgnore
    @OneToMany(mappedBy = "memberEntity")
    private List<BoardEntity> boards = new ArrayList<>();

}
