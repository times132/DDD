package com.times132.ddd.User.infra;

import com.times132.ddd.User.infra.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
