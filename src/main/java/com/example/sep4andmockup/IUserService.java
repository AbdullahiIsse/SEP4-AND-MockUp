package com.example.sep4andmockup;

import com.example.sep4andmockup.Entities.User;

public interface IUserService {

    User validateUser(String username, String password) throws Exception;
}
