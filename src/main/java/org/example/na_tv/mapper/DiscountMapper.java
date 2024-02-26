package org.example.na_tv.mapper;

import org.example.na_tv.model.dto.DiscountDTO;
import org.example.na_tv.model.entity.Discount;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.example.na_tv.base.BaseMapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR,componentModel = "spring")
public interface DiscountMapper extends BaseMapper<Discount, DiscountDTO>{

}
