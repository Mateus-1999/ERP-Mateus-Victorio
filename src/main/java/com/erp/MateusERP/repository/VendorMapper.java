package com.erp.MateusERP.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.erp.MateusERP.dto.VendorDTO;


@Mapper
public interface VendorMapper {

	@Select("SELECT ID as id, CODE as code, NAME as name, ADD_BY as addBy," +
			" 		TO_CHAR(ADD_DATE,'DD/MM/YYYY HH24:MI:SS') as addDate," +
			" 		EDIT_BY as editBy," +
			" 		TO_CHAR(EDIT_DATE,'DD/MM/YYYY HH24:MI:SS') as editDate " +
            "  FROM VENDOR" +
			" ORDER BY ID")
    List<VendorDTO> GetAllVendors();
	
	@Insert(" INSERT INTO VENDOR " + 
			" (ID, CODE, NAME, ADD_BY, ADD_DATE, EDIT_BY, EDIT_DATE) " +
			" VALUES " +
			" ((SELECT MAX(ID) + 1 FROM VENDOR), #{code}, #{name}, #{addBy}, NOW(), #{editBy}, NOW()) "
			)
	void InsertVendor(VendorDTO dto);

}
