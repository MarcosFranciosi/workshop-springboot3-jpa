package com.franciosi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciosi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
