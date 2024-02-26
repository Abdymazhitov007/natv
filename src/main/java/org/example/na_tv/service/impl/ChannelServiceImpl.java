package org.example.na_tv.service.impl;

import org.example.na_tv.base.BaseServiceImpl;
import org.example.na_tv.mapper.ChannelMapper;
import org.example.na_tv.model.dto.ChannelDTO;
import org.example.na_tv.model.entity.Channel;
import org.example.na_tv.repository.ChannelRepository;
import org.example.na_tv.service.ChannelService;

public class ChannelServiceImpl extends BaseServiceImpl<Channel, ChannelRepository, ChannelDTO, ChannelMapper> implements ChannelService {
    public ChannelServiceImpl(ChannelRepository rep, ChannelMapper mapper) {
        super(rep, mapper);
    }
}
