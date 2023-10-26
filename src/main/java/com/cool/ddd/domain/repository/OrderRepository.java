package com.cool.ddd.domain.repository;


import com.cool.ddd.domain.model.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Optional<Order> findById(UUID id);

    void save(Order order);
}
