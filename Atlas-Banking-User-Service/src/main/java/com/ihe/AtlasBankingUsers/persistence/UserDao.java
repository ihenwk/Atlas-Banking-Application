package com.ihe.AtlasBankingUsers.persistence;

import com.ihe.AtlasBankingUsers.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Extend JpaRepository to get a bunch of generic CRUD methods into our type that allows creating new users, viewing users,
updating user data, deleting data from the database. It also allows the Spring Data JPA repository infrastructure to scan
the classpath for this interface and create a Spring bean for it.
 */
@Repository
public class UserDao extends JpaRepository<Users,Integer> {

}
