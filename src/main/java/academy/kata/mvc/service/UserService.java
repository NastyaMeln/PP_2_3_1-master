package academy.kata.mvc.service;

import academy.kata.mvc.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
