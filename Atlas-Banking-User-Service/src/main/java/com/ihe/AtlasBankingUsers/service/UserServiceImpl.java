package com.ihe.AtlasBankingUsers.service;

import com.ihe.AtlasBankingUsers.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersDao usersDao;

    @Override
    public List<Users> getAllUsers() {
        return usersDao.findAll();
    }

    //search user by userId functionality
    @Override
    public Users searchUsersByUserId(int userId) {
        return usersDao.searchUsersByUserId(userId);
    }

    //Add user functionality
    @Override
    public boolean addUser(Users users) {
        Users user = usersDao.findById(users.getUserId()).orElse(null);
        if (user == null) {
            usersDao.save(users);
            return true;
        } else {
            return false;
        }
    }

    //update User Balance functionality
    @Override
    public boolean updateUserBalance ( int userId, double increment, double balance){
        Users users1 = usersDao.searchUsersByUserId(userId);

        if (users1 != null) {
            usersDao.updateBalance(userId, increment,balance) ;
            return true;
        } else {
            return false;
        }
    }

    // login check functionality
    @Override
    public Users loginCheck(int userId, String userPassword) {
        return usersDao.findUserByUserIdAndPassword(userId, userPassword);

    }
}
