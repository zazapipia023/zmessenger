package com.zaza.zmessenger.models.redis;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("user_session")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserSession {

    @Id
    private String userId;

    private String accessToken;

    private String refreshToken;

    private String deviceInfo;

}
