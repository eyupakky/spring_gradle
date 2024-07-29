package org.smart.springboot.service;


import org.smart.springboot.dto.UserDto;
import org.smart.springboot.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}