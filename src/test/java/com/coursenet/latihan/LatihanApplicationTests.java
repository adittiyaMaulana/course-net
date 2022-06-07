package com.coursenet.latihan;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coursenet.latihan.config.FirstComponent;
import com.coursenet.latihan.domain.Paket;
import com.coursenet.latihan.service.AntarAja;
import com.coursenet.latihan.service.Jne;
import com.coursenet.latihan.service.ShipperInterface;
import com.coursenet.latihan.service.Sicepat;

@SpringBootTest
class LatihanApplicationTests {

	@Autowired
	public FirstComponent firstComponent;
	
	@Autowired
	private AntarAja antarAja;
	
	@Autowired
	private Sicepat sicepat;
	
	@Autowired
	private Jne jne;
	
	@Test
	void contextLoads() {
		firstComponent.sayHello();
		
		Paket paket = new Paket();
		paket.setShipperId(2);
		paket.setNamaBarang("Meja belajar");
		antarAja.checkPackage(paket);
		
		ShipperInterface shipper = null;
		shipper = mappingShipper(paket);
		shipper.checkPackage(paket);
		shipper.sendPackage(paket);
	}
	
	private ShipperInterface mappingShipper(Paket paket) {
		
		if(paket.getShipperId()==1) {
			return antarAja;
		}else if(paket.getShipperId()==2) {
			return sicepat;
		}else if(paket.getShipperId()==3) {
			return jne;
		}
		
		return null;
	}

}
