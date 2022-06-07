package com.coursenet.latihan.service;

import com.coursenet.latihan.domain.Paket;

public abstract class Shipper {
	//kirim paket, cek status
	protected String namaShipper;
	int status;
	
	public void sendPackage(Paket paket) {
		System.out.println(namaShipper + " sedang mengirim " + paket.getNamaBarang());
		status=1;
	}
	
	public void checkPackage(Paket paket) {
		if(status==1)
			System.out.println(namaShipper + " sudah mengirim "  + paket.getNamaBarang());
		else
			System.out.println(namaShipper + " belum mengirim "  + paket.getNamaBarang());
	}
}
