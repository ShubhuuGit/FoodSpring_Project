package com.food.foodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApp.dto.Items;

public interface ItemRepo extends JpaRepository<Items,Integer> {

}
