package com.erp.MateusERP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erp.MateusERP.dto.VendorDTO;
import com.erp.MateusERP.service.VendorService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("Vendor")
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	@Operation(summary = "Test Message", description = "Message to test the connection between Application and Browser")
	@GetMapping("TestMessage")
	public String TestMessage() {
		return "Test Vendor Message";
	}
	
	@Operation(summary = "Get All Vendors", description = "Return all valid vendors from the VENDOR table")
	@GetMapping("GetAllVendors")
	public List<VendorDTO> GetAllVendors(){
		return vendorService.GetAllVendors();
	}
	
	@Operation(summary = "Get Vendors Quantity", description = "Return the vendor quantity from the VENDOR table")
	@GetMapping("GetVendorsQty")
	public Long GetVendorsQty() {
		return vendorService.GetVendorsQty();
	}
	
	@Operation(summary = "Get Vendors Test", description = "Return only the vendor registered with the name (Test)")
	@GetMapping("GetVendorTest")
	public List<VendorDTO> GetVendorTest(){
		return vendorService.GetVendorTest();
	}
	
	@Operation(summary = "Get Vendor by ID", description = "Return the vendor with ID equal the ID passed in the URL parameter")
	@GetMapping("GetVendorByID")
	public List<VendorDTO> GetVendorByID(@RequestParam Integer id) {
		return vendorService.GetVendorByID(id);
	}

}
