package com.franciosi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciosi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
