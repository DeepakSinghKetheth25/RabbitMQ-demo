package com.bdo.rabbitmq.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderStatus {

	private Order order;
	private String status; //Whether order is in progress or Completed.
	private String message;
}
