package com.zaza.zmessenger.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "chat_members")
@Getter
@Setter
public class ChatMembers {

    @Id
    @ManyToOne
    @JoinColumn(name = "chat_id", nullable = false)
    private Chats chat;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(name = "joined_at", nullable = false)
    private Timestamp joinedAt = new Timestamp(System.currentTimeMillis());

}
