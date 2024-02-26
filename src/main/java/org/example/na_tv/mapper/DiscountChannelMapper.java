package org.example.na_tv.mapper;

import org.example.na_tv.base.BaseMapper;
import org.example.na_tv.model.dto.DiscountChannelDTO;
import org.example.na_tv.model.entity.DiscountChannel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;


@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface DiscountChannelMapper extends BaseMapper<DiscountChannel, DiscountChannelDTO> {
}
