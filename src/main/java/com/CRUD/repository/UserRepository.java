package com.CRUD.repository;

import com.CRUD.entity.USERS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<USERS,Integer> {
 USERS findByName(String name);
}
