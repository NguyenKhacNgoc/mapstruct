package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.request.UserCreationRequest;
import com.example.mapstruct.dto.response.UserResponse;
import com.example.mapstruct.entity.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper
{
    @BeforeMapping
    default void encodePassword(UserCreationRequest request, @MappingTarget User user) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        request.setPassword(passwordEncoder.encode(request.getPassword()));
    }
    User toUser(UserCreationRequest request);
    @AfterMapping
    default void aftermMapping(UserCreationRequest request, @MappingTarget User user){
        System.out.println("Password: " + user.getPassword());
    }
    UserResponse toUserResponse(User user);

    @Named("calculateAge")
    default int calculateAge(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    List<User> toListUser(List<UserCreationRequest> requests);

}
