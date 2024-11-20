package com.assignment.productFeign.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.productFeign.service.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemController {
	
	private final ItemService itemService;
	
	@GetMapping("/rest-template")
    public ResponseEntity<String> getItemsViaRestTemplate() {
        return ResponseEntity.ok(itemService.getItemsUsingRestTemplate());
    }

    @GetMapping("/feign")
    public ResponseEntity<String> getItemsViaFeign() {
        return ResponseEntity.ok(itemService.getItemsUsingFeign());
    }
	

}
