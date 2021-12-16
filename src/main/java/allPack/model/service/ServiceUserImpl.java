package allPack.model.service;


import allPack.model.daoCrud.UserDao;
import allPack.model.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class ServiceUserImpl implements ServiceUser {

    @Autowired
    private UserDao userDao;


    @Override
    @Transactional
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User fiendUserById(int id) {
        return userDao.fiendUserById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
