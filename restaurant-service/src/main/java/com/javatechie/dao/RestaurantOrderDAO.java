package com.javatechie.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.javatechie.dto.OrderResponseDto;

@Component
public class RestaurantOrderDAO {

	public OrderResponseDto getOrders(String orderId) {
		return generateRandomOrders().get(orderId);
	}

	private Map<String, OrderResponseDto> generateRandomOrders() {
		Map<String, OrderResponseDto> orderMap = new HashMap<>();

		orderMap.put("35fds631", new OrderResponseDto("35fds63", "VEG-MEALS", 1, 199, new Date(), "READY", 15));
		orderMap.put("9u71245h",
				new OrderResponseDto("9u71245h", "HYDERABADI DUM BIRYANI", 2, 641, new Date(), "PREPARING", 59));
		orderMap.put("37jbd832",
				new OrderResponseDto("37jbd832", "PANEER BUTTER MASALA", 1, 325, new Date(), "DELIVERED", 0));

		return orderMap;
	}

}
