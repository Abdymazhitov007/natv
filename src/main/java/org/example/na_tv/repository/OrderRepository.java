package org.example.na_tv.repository;

import org.example.na_tv.base.BaseRep;
import org.example.na_tv.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends BaseRep<Order> {
}
