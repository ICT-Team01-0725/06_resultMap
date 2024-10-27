package com.ict.resultMap.phj;

import com.ict.resultMap.phj.result_phj_user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface result_phj_map {
	result_phj_user getUserById(@Param("id") int id);
}
