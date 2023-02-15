package com.franciosi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciosi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
