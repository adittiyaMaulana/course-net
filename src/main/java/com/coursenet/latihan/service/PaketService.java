package com.coursenet.latihan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursenet.latihan.dto.PaketRequestDto;
import com.coursenet.latihan.dto.PaketResponseDto;
import com.coursenet.latihan.entity.PaketEntity;
import com.coursenet.latihan.repository.PaketRepository;

@Service
public class PaketService {

	@Autowired
	private PaketRepository paketRepository;
	
	public PaketResponseDto createPaket(PaketRequestDto paketRequestDto) {
		PaketEntity paket = new PaketEntity();
		paket.setNamaBarang(paketRequestDto.getNamaBarang());
		paketRepository.save(paket);
		
		PaketResponseDto paketResponseDto = new PaketResponseDto();
		paketResponseDto.setNamaBarang(paket.getNamaBarang());
		paketResponseDto.setId(paket.getId());
		return paketResponseDto;
	}
}
