package com.oracle.bootMyBatis.dao;

import java.util.List;

import com.oracle.bootMyBatis.model.Emp;

public interface EmpDao {
	List<Emp>     list(Emp emp);
	int           total(); 

}
