package com.zaza.zmessenger.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("user_online_status")
@Getter
@Setter
public class UserOnlineStatus {

    @Id
    private String userId;

    private Long lastActive;

}
