package com.zaza.zmessenger.repositories.redis;

import com.zaza.zmessenger.models.redis.UserOnlineStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOnlineStatusRepository extends CrudRepository<UserOnlineStatus, String> {
}
