package org.smart.springboot.service;

import org.smart.springboot.dto.UserDto;

public interface AuthService {
    String login(UserDto loginDto);

    String register(UserDto registerDto);
}
