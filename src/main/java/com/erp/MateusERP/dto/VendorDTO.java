package com.erp.MateusERP.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendorDTO {
	private Integer id;
	private String code;
	private String name;
	private String addBy;
	private Date addDate;
	private String editBy;
	private Date editDate;
	
	
}
