package com.org.test.service;

import com.org.test.entity.User;
import com.org.test.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
