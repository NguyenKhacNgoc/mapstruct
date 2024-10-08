package com.example.mapstruct.service;

import com.example.mapstruct.dto.request.UserCreationRequest;
import com.example.mapstruct.dto.response.UserResponse;
import com.example.mapstruct.entity.User;
import com.example.mapstruct.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService
{
    @Autowired
    private UserMapper userMapper;
    public User create(UserCreationRequest request) {
        log.info("User: " + request.getPassword());
        return userMapper.toUser(request);
    }
}
