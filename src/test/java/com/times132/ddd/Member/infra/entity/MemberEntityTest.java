package com.times132.ddd.Member.infra.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberEntityTest {

    @Test
    @DisplayName("유저 저장")
    void save_user() {
        MemberEntity memberEntity = new MemberEntity();
    }
}
