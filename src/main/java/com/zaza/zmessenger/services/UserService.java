package com.zaza.zmessenger.services;

import com.zaza.zmessenger.models.postgres.User;
import com.zaza.zmessenger.repositories.postgres.UserRepository;
import com.zaza.zmessenger.repositories.redis.UserOnlineStatusRepository;
import com.zaza.zmessenger.repositories.redis.UserSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserOnlineStatusRepository onlineStatusRepository;
    private UserSessionRepository sessionRepository;
    private UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
