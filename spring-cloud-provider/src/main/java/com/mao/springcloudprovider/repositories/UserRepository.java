package com.mao.springcloudprovider.repositories;


import com.mao.springcloudprovider.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ${DESCRIPTION}
 *
 * @author 毛进宝
 * @date Created in 10:55 2018-7-30
 * @modified By
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
