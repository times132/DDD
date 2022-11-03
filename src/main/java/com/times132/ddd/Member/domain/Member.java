package com.times132.ddd.Member.domain;

import com.times132.ddd.common.domain.AggregateRoot;
import lombok.Builder;
import lombok.Getter;

public class Member extends AggregateRoot<Member.MemberProps> {
    @Getter
    @Builder
    public static class MemberProps {
        private Name name;
        private Age age;
    }

    protected Member(MemberProps object, Long id) {
        super(object, id);
    }

    public static Member create(MemberProps props, Long id) {
        return new Member(props, id);
    }

    public void changeMemberName(Name newName) {

    }
}
