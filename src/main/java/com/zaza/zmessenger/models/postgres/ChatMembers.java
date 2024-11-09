package com.zaza.zmessenger.models.postgres;

import com.zaza.zmessenger.models.postgres.compositekeys.ChatMembersId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "chat_members")
@Getter
@Setter
public class ChatMembers {

    @EmbeddedId
    private ChatMembersId id;

    @ManyToOne
    @MapsId("chatId")
    @JoinColumn(name = "chat_id", nullable = false)
    private Chat chat;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "joined_at", nullable = false)
    private Timestamp joinedAt = new Timestamp(System.currentTimeMillis());

}
