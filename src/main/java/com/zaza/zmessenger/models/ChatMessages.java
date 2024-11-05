package com.zaza.zmessenger.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("chat_messages")
@Getter
@Setter
public class ChatMessages {

    @Id
    private String chatId;

    private List<Messages> messages;

}
