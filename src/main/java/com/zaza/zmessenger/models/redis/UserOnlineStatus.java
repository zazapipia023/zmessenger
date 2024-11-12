package com.zaza.zmessenger.models.redis;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("user_online_status")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserOnlineStatus {

    @Id
    private String userId;

    private Long lastActive;

}
