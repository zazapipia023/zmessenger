package com.zaza.zmessenger.services;

import com.zaza.zmessenger.repositories.redis.UserOnlineStatusRepository;
import com.zaza.zmessenger.repositories.redis.UserSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserOnlineStatusRepository onlineStatusRepository;
    private UserSessionRepository sessionRepository;



}
