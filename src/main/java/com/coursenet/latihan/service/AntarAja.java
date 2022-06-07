package com.coursenet.latihan.service;

import org.springframework.stereotype.Service;

@Service
public class AntarAja extends Shipper implements ShipperInterface{
	
	private static AntarAja antarAja;
	
	public AntarAja() {
		namaShipper = "AntarAja";
	}
	
	public static AntarAja getInstance() {
		if(antarAja == null) {
			antarAja = new AntarAja();
		}
		return antarAja;
	}
}
