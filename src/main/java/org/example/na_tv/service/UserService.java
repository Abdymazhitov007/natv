package org.example.na_tv.service;

import org.example.na_tv.model.dto.UserDTO;
import org.example.na_tv.model.entity.User;
import org.example.na_tv.base.BaseService;
import org.example.na_tv.model.request.UserRequest;
import org.example.na_tv.model.response.UserResponse;
import org.springframework.http.ResponseEntity;

public interface UserService extends BaseService<UserDTO> {
    UserResponse create(UserRequest request);
}
