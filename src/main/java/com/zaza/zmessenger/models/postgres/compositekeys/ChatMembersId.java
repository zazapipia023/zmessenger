package com.zaza.zmessenger.models.postgres.compositekeys;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class ChatMembersId implements Serializable {

    private Long chatId;
    private Long userId;

}
