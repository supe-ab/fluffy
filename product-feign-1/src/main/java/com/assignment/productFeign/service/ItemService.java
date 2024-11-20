package com.assignment.productFeign.service;

public interface ItemService {
	
	String getItemsUsingRestTemplate();
	String getItemsUsingFeign();
}
