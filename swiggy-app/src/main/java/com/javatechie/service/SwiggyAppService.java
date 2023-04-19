package com.javatechie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.client.RestaurantServiceClient;
import com.javatechie.dto.OrderResponseDto;

@Service
public class SwiggyAppService {

	@Autowired
	private RestaurantServiceClient restaurantServiceClient;

	public String greeting() {
		return "Welcome to Swiggy App Service";
	}

	public OrderResponseDto checkOrderStatus(String orderId) {
		return restaurantServiceClient.fetchOrderStatus(orderId);
	}

}
