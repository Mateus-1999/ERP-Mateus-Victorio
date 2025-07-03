package com.erp.MateusERP.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.MateusERP.dto.VendorDTO;
import com.erp.MateusERP.repository.VendorMapper;

@Service
public class VendorService {
	
	@Autowired
	private VendorMapper vendorMapper;
	
	
	public List<VendorDTO> GetAllVendors(){
		List<VendorDTO> AllVendors = vendorMapper.GetAllVendors();
		AllVendors.stream().findFirst();
		return AllVendors;
	}
	
	public Long GetVendorsQty() {
		List<VendorDTO> AllVendors = vendorMapper.GetAllVendors();
		
		return AllVendors.stream().count(); 
	}
	
	public List<VendorDTO> GetVendorTest (){
		List<VendorDTO> VendorTest = vendorMapper.GetAllVendors();
		return VendorTest.stream().
								filter(v -> "TEST".equals(v.getCode())).
								collect(Collectors.toList());
	}
	
	public List<VendorDTO> GetVendorByID(Integer id) {
		System.out.println(id);
		
		List<VendorDTO> AllVendors = vendorMapper.GetAllVendors();
		
		
		return AllVendors.stream().
								  filter(a -> id.equals(a.getId())).
								  collect(Collectors.toList());
	}
	
	public boolean CreateVendor(VendorDTO dto) {
		try {
			vendorMapper.InsertVendor(dto);
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
}
