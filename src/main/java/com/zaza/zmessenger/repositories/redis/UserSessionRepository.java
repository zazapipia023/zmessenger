package com.zaza.zmessenger.repositories.redis;

import com.zaza.zmessenger.models.redis.UserSession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSessionRepository extends CrudRepository<UserSession, String> {
}
