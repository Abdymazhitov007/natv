package org.example.na_tv.mapper;

import org.example.na_tv.base.BaseMapper;
import org.example.na_tv.model.dto.ChannelDTO;
import org.example.na_tv.model.entity.Channel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface ChannelMapper extends BaseMapper<Channel, ChannelDTO> {
}
