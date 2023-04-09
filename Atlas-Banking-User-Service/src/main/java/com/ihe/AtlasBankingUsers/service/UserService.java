package com.ihe.AtlasBankingUsers.service;

import com.ihe.AtlasBankingUsers.entity.Users;

public interface UserService {

    public Users searchUsersByUserId(int userId);
    public boolean updateUserBalance(int id, double increment, double balance);
    Users loginCheck(int userId, String userPassword);
    public boolean addUser(Users users);

}
