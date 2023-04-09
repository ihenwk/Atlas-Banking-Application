package com.ihe.AtlasBankingUsers.persistence;

import com.ihe.AtlasBankingUsers.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/* Extend JpaRepository to get a bunch of generic CRUD methods into our type that allows creating new users, viewing users,
updating user data, deleting data from the database. It also allows the Spring Data JPA repository infrastructure to scan
the classpath for this interface and create a Spring bean for it.
 */
@Repository
public class UserDao extends JpaRepository<Users,Integer> {

    //JPQL Query for searching user by userId input
    @Query(value = "SELECT * FROM users WHERE userId =:id", nativeQuery = true)
    Users searchUsersByUserId(@Param("id") int userId);

    @Modifying
    @Transactional
    @Query(value = "insert into users values(:uid,:compName,:phoneNum,:email,:balance,:userPassword", nativeQuery = true)
    int addUser(@Param("uid") int userId, @Param("compName") String companyName, @Param("phoneNum") String phoneNumber,@Param("email") String eMail,@Param("balance")double balance,@Param("userPassword") String userPassword);

    @Transactional
    @Modifying
    @Query(value = "update users set balance=:balance +:inc where userId=:id", nativeQuery = true) // sort this out -how do i add balance and increment?
    int updateBalance(@Param("id") int userId, @Param("inc") double increment,@Param("balance") double balance);

    @Query(value ="SELECT * FROM users WHERE userId =:id and userPassword =:password", nativeQuery = true)
    Users findUserByUserIdAndPassword(@Param("id") int userId, @Param("password") String userPassword);
}
