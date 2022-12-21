package ru.sharipova.boot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sharipova.boot.dao.UserDao;
import ru.sharipova.boot.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private UserDao userDao;


    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void changeUser(long id, User updatesUser) {
        userDao.changeUser(id, updatesUser);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
}
