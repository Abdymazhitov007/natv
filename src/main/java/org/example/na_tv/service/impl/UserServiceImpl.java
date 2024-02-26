package org.example.na_tv.service.impl;

import org.example.na_tv.base.BaseServiceImpl;
import org.example.na_tv.mapper.UserMapper;
import org.example.na_tv.model.dto.UserDTO;
import org.example.na_tv.model.entity.User;
import org.example.na_tv.model.request.UserRequest;
import org.example.na_tv.model.response.UserResponse;
import org.example.na_tv.repository.UserRepository;
import org.example.na_tv.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,  UserRepository, UserDTO, UserMapper> implements UserService {

    public UserServiceImpl(UserRepository rep, UserMapper mapper) {
        super(rep, mapper);
    }

    @Override
    public UserResponse create(UserRequest request) {

        UserDTO user = new UserDTO();
        user.setEmail(request.getEmail());
        user.setFullName(request.getFullName());
        user.setPhoneNumber(request.getPhoneNumber());

        user = save(user);

        return UserResponse.builder()
                .id(user.getId())
                .phoneNumber(user.getPhoneNumber())
                .email(user.getEmail())
                .fullName(user.getFullName())
                .build();
    }

    @Override
    public UserDTO update(UserDTO e) {

        UserDTO dto = findById(e.getId());
        dto.setEmail(e.getEmail());
        dto.setPhoneNumber(e.getPhoneNumber());
        dto.


        return ;



    }
}
