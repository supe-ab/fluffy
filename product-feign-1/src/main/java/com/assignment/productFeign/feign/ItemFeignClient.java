package com.assignment.productFeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="itemService",url="http://localhost:8080/api/items")
public interface ItemFeignClient {
	
	@GetMapping
	String getItems();

}
