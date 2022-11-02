package com.times132.ddd.User.domain;

import com.times132.ddd.common.domain.AggregateRoot;
import lombok.Builder;
import lombok.Getter;

public class User extends AggregateRoot<User.UserProps> {
    @Getter
    @Builder
    public static class UserProps {
        private String name;
        private int age;
    }

    protected User(UserProps object, Long id) {
        super(object, id);
    }
}
