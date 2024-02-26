package org.example.na_tv.service.impl;

import org.example.na_tv.base.BaseServiceImpl;
import org.example.na_tv.mapper.OrderBookMapper;
import org.example.na_tv.model.dto.OrderBookDTO;
import org.example.na_tv.model.entity.OrderBook;
import org.example.na_tv.repository.OrderBookRepository;
import org.example.na_tv.service.OrderBookService;

public class OrderBookServiceImpl extends BaseServiceImpl<OrderBook, OrderBookRepository, OrderBookDTO, OrderBookMapper> implements OrderBookService {
    public OrderBookServiceImpl(OrderBookRepository rep, OrderBookMapper mapper) {
        super(rep, mapper);
    }
}
