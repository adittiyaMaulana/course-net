package com.coursenet.latihan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coursenet.latihan.dto.HelloRequestDto;
import com.coursenet.latihan.dto.PaketRequestDto;
import com.coursenet.latihan.dto.PaketResponseDto;
import com.coursenet.latihan.service.PaketService;

@RestController
public class PaketController {

	@Autowired
	private PaketService paketService;
	
	@PostMapping("/hello")
	public String sayHello(@RequestBody HelloRequestDto hellloRequest) {
		// TODO document why this method is empty
		return "hallo"+hellloRequest.getNama();
	}
	
	@PostMapping("/createPaket")
	public PaketResponseDto createPaket(@RequestBody PaketRequestDto paketRequest) {
		// TODO document why this method is empty
		return paketService.createPaket(paketRequest);
	}	
}
