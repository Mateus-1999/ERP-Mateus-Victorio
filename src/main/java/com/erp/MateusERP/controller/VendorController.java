package com.erp.MateusERP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.MateusERP.dto.VendorDTO;
import com.erp.MateusERP.service.VendorService;

@RestController
@RequestMapping("Vendor")
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	@GetMapping("TestMessage")
	public String TestMessage() {
		return "Test Vendor Message";
	}
	
	@GetMapping("GetAllVendors")
	public List<VendorDTO> GetAllVendors(){
		return vendorService.GetAllVendors();
	}
	
	@GetMapping("GetVendorsQty")
	public Long GetVendorsQty() {
		return vendorService.GetVendorsQty();
	}
	
	@GetMapping("GetVendorTest")
	public List<VendorDTO> GetVendorTest(){
		return vendorService.GetVendorTest();
	}

}
