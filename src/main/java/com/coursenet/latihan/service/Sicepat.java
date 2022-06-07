package com.coursenet.latihan.service;

import org.springframework.stereotype.Service;

@Service
public class Sicepat extends Shipper implements ShipperInterface {
	public Sicepat() {
		namaShipper = "Sicepat";
	}
}
