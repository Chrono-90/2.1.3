package allPack.model.service;


import allPack.model.model.User;

import java.util.List;

public interface ServiceUser {
    void createUser(User user);
    void removeUser(int id);
    User fiendUserById(int id);
    List<User> getAllUsers();
}
