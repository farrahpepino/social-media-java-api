package social_media.api.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import social_media.api.models.User;
import social_media.api.repositories.impl.UserRepository;
import social_media.api.services.interfaces.IUserService;

@Service
public class UserService implements IUserService{
    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public void deleteUser(UUID id) {
        repository.deleteById(id);
    }

}
