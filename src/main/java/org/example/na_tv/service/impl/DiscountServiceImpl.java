package org.example.na_tv.service.impl;

import org.example.na_tv.base.BaseServiceImpl;
import org.example.na_tv.mapper.DiscountMapper;
import org.example.na_tv.model.dto.DiscountDTO;
import org.example.na_tv.model.entity.Discount;
import org.example.na_tv.repository.DiscountRepository;
import org.example.na_tv.service.DiscountService;

public class DiscountServiceImpl extends BaseServiceImpl<Discount, DiscountRepository, DiscountDTO, DiscountMapper> implements DiscountService {
    public DiscountServiceImpl(DiscountRepository rep, DiscountMapper mapper) {
        super(rep, mapper);
    }
}
