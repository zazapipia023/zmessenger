package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatsRepository extends JpaRepository<Chat, Long> {
}
