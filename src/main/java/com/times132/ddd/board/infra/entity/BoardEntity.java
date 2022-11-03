package com.times132.ddd.board.infra.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.times132.ddd.Member.infra.entity.MemberEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "BOARD")
public class BoardEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String contents;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "member_id")
    private MemberEntity memberEntity;
}
