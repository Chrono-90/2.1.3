package allPack.model.daoCrud;

import allPack.model.model.User;

import java.util.List;

public interface Dao {
    void createUser(User user);
    void removeUser(int id);
    User fiendUserById(int id);
    List<User> getAllUsers();
}
