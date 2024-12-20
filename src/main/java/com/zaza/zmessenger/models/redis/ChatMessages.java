package com.zaza.zmessenger.models.redis;

import com.zaza.zmessenger.models.postgres.Message;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("chat_messages")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessages {

    @Id
    private String chatId;

    private List<Message> messages;

}
