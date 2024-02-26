package org.example.na_tv.mapper;

import org.example.na_tv.base.BaseMapper;
import org.example.na_tv.model.dto.UserDTO;
import org.example.na_tv.model.entity.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserDTO> {
}
