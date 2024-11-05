package com.zaza.zmessenger.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("user_session")
@Getter
@Setter
public class UserSession {

    @Id
    private String userId;

    private String accessToken;

    private String refreshToken;

    private String deviceInfo;

}
