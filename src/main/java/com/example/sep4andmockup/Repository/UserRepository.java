package com.example.sep4andmockup.Repository;

import com.example.sep4andmockup.Entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {


    @Override
    public List<User> findAll();

    @Query(nativeQuery = true, value = "select * from user_accounts where username = ?1 and password = ?2 ")
    User findByUsernameAndPassword(String username,String password);


}
