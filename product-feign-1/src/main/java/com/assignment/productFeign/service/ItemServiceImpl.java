package com.assignment.productFeign.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.productFeign.feign.ItemFeignClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

	private final RestTemplate restTemplate;
	private final ItemFeignClient itemFeignClient;
	
	@Override
	public String getItemsUsingRestTemplate() {
		
		return restTemplate.getForObject("http://localhost:8080/api/items", String.class);
		
	}

	@Override
	public String getItemsUsingFeign() {
		
		return itemFeignClient.getItems();
	}
	
	

}
