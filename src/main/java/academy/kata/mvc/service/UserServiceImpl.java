package academy.kata.mvc.service;

import academy.kata.mvc.model.User;
import academy.kata.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        System.out.println(userRepository.getAllUsers());
        return userRepository.getAllUsers();
    }

    @Transactional
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return userRepository.getUserById(id);
    }

    @Transactional
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Transactional
    public void deleteUser(long id) {
        userRepository.delete(id);
    }
}
