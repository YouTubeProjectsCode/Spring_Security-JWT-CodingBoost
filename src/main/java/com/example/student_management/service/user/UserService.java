package com.example.student_management.service.user;

import com.example.student_management.dto.SignupRequest;
import com.example.student_management.dto.UserDto;

public interface UserService {

     UserDto createUser(SignupRequest signupRequest) throws Exception;

     Boolean hasUserWithEmail(String email);


}
