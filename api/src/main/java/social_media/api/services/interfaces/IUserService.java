package social_media.api.services.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import social_media.api.models.User;

public interface IUserService {
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(UUID id);
    void deleteUser(UUID id);
}
