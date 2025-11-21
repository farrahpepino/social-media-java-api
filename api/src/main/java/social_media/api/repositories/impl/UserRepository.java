package social_media.api.repositories.impl;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import social_media.api.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}