package com.times132.ddd.User.infra.entity;

import com.times132.ddd.User.infra.UserRepository;
import com.times132.ddd.board.infra.BoardRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Test
    @DisplayName("유저 저장")
    void save_user() {
        User user = new User();
    }
}
