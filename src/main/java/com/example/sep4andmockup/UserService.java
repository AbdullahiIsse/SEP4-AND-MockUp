package com.example.sep4andmockup;

import com.example.sep4andmockup.Entities.User;
import com.example.sep4andmockup.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{


    @Autowired
    UserRepository userRepository;



    @Override
    public User validateUser(String username, String password) throws Exception {

        User users = userRepository.findByUsernameAndPassword(username, password);
        if (users == null){
            throw new Exception("user not found");
        }

        return users;

    }





}
