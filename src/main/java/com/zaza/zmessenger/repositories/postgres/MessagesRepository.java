package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages, Long> {
}
