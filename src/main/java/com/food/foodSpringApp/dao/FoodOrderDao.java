package com.food.foodSpringApp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.foodSpringApp.dto.FoodOrder;
import com.food.foodSpringApp.dto.Items;
import com.food.foodSpringApp.repository.FoodRepo;
import com.food.foodSpringApp.repository.ItemRepo;

@Repository
public class FoodOrderDao {

	@Autowired
	FoodRepo foodOrderRepo;

	@Autowired
	ItemRepo iteamRepo;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		List<Items> listOfItems = foodOrder.getItems();
		List<Items> res = new ArrayList<>();
		if (listOfItems.isEmpty()) {
			foodOrder = foodOrderRepo.save(foodOrder);
		} else {
			foodOrder = foodOrderRepo.save(foodOrder);
			for (Items iteam : listOfItems) {
				iteam.setFoodorder(foodOrder);
				res.add(iteamRepo.save(iteam));
			}
			foodOrder.setItems(res);
		}
		return foodOrder;

	}

	public Optional<FoodOrder> getFoodOrderById(int id) {
		return foodOrderRepo.findById(id);
	}

	public List<FoodOrder> getAllFoodOrder() {
		return foodOrderRepo.findAll();
	}

	public FoodOrder updateFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
	}

	public void deleteFoodOrder(int id) {
		foodOrderRepo.deleteById(id);
	}
}
