package com.erp.MateusERP.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.erp.MateusERP.dto.VendorDTO;


@Mapper
public interface VendorMapper {

	@Select("SELECT ID as id, CODE as code, NAME as name, ADD_BY as addBy, ADD_DATE as addDate, EDIT_BY as editBy, EDIT_DATE as editDate " +
            "  FROM VENDOR" +
			" ORDER BY ID")
    List<VendorDTO> GetAllVendors();

}
