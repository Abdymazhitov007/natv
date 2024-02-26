package org.example.na_tv.mapper;

import org.example.na_tv.model.dto.OrderDTO;
import org.example.na_tv.model.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.example.na_tv.base.BaseMapper;


@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface OrderMapper extends BaseMapper<Order, OrderDTO> {
}
