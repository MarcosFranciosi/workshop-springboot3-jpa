package com.franciosi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciosi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
