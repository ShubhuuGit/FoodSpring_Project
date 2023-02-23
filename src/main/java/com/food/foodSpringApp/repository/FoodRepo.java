package com.food.foodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApp.dto.FoodOrder;

public interface FoodRepo extends JpaRepository<FoodOrder, Integer> {

}
