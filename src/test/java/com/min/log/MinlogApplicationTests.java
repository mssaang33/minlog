package com.min.log;

import com.min.log.user.entity.UserEntity;
import com.min.log.user.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinlogApplicationTests {

    @Autowired
    private UserRepository userRepository;


    @Test
    @DisplayName("유저입력테스트")
    void userAdd(){
        UserEntity user = new UserEntity();
        user.setUser_id("test");
        user.setEmail("test@test.com");
        user.setDecription("테스트입니다.");
        user.setName("테스트");

        this.userRepository.save(user);
    }


}
