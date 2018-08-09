package com.mao.springcloudprovider.resource;


import com.mao.springcloudprovider.domain.User;
import com.mao.springcloudprovider.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author 毛进宝
 * @date Created in 11:08 2018-7-30
 * @modified By
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findOne(id);
    }
}
