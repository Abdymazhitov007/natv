package org.example.na_tv.service.impl;

import org.example.na_tv.base.BaseServiceImpl;
import org.example.na_tv.mapper.DiscountChannelMapper;
import org.example.na_tv.model.dto.DiscountChannelDTO;
import org.example.na_tv.model.entity.DiscountChannel;
import org.example.na_tv.repository.DiscountChannelRepository;
import org.example.na_tv.service.DiscountChannelService;

public class DiscountChannelServiceImpl extends BaseServiceImpl<DiscountChannel, DiscountChannelRepository, DiscountChannelDTO, DiscountChannelMapper> implements DiscountChannelService {
    public DiscountChannelServiceImpl(DiscountChannelRepository rep, DiscountChannelMapper mapper) {
        super(rep, mapper);
    }
}
