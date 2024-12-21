package com.pb_booking.repository;

import com.pb_booking.entity.USER;
import org.springframework.data.jpa.repository.JpaRepository;

public interface USER_REPOSITORY extends JpaRepository<USER,Integer>{
    USER findByName(String name);

}
