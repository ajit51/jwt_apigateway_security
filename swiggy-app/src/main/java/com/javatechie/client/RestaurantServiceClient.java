package com.javatechie.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.javatechie.dto.OrderResponseDto;

@Component
public class RestaurantServiceClient {
	@Autowired
	private RestTemplate template;

	public OrderResponseDto fetchOrderStatus(String orderId) {
		return template.getForObject("http://RESTAURANT-SERVICE/restaurant/orders/status/" + orderId,
				OrderResponseDto.class);
	}
}
