package com.zaza.zmessenger.models.postgres;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "messages")
@Getter
@Setter
public class Message {

    @Id
    @Column(name = "message_id")
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "chat_id", nullable = false)
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User sender;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

    @Column(name = "is_read")
    private Boolean isRead = false;

}
