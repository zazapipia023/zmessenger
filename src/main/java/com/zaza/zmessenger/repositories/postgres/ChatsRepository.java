package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.Chats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatsRepository extends JpaRepository<Chats, Long> {
}
