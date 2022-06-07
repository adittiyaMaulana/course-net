package com.coursenet.latihan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coursenet.latihan.entity.PaketEntity;

@Repository
public interface PaketRepository extends JpaRepository<PaketEntity, Long> {
	
}
