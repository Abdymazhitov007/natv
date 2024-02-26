package org.example.na_tv.mapper;

import org.example.na_tv.base.BaseMapper;
import org.example.na_tv.model.dto.OrderBookDTO;
import org.example.na_tv.model.entity.OrderBook;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface OrderBookMapper extends BaseMapper<OrderBook, OrderBookDTO>{
}
