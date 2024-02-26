package org.example.na_tv.service.impl;

import org.example.na_tv.base.BaseService;
import org.example.na_tv.base.BaseServiceImpl;
import org.example.na_tv.mapper.OrderMapper;
import org.example.na_tv.model.dto.OrderDTO;
import org.example.na_tv.model.entity.Order;
import org.example.na_tv.repository.OrderRepository;
import org.example.na_tv.service.OrderService;

public class OrderServiceImpl extends BaseServiceImpl<Order, OrderRepository, OrderDTO, OrderMapper> implements OrderService {
    public OrderServiceImpl(OrderRepository rep, OrderMapper mapper) {
        super(rep, mapper);
    }
}
