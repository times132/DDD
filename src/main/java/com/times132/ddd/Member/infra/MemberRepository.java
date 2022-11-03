package com.times132.ddd.Member.infra;

import com.times132.ddd.Member.infra.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {


}
