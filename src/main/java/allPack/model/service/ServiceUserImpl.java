package allPack.model.service;


import allPack.model.daoCrud.Dao;
import allPack.model.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceUserImpl implements ServiceUser {

    @Autowired
    private Dao dao;


    @Override
    @Transactional
    public void createUser(User user) {
        dao.createUser(user);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        dao.removeUser(id);
    }

    @Override
    @Transactional
    public User fiendUserById(int id) {
        return dao.fiendUserById(id);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }
}
