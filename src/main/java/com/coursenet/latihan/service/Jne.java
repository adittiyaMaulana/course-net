package com.coursenet.latihan.service;

import org.springframework.stereotype.Service;

@Service
public class Jne extends Shipper implements ShipperInterface {
	public Jne() {
		namaShipper = "Jne";
	}
}
