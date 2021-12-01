package com.oracle.bootMyBatis.service;

import java.util.List;
import java.util.Map;

import com.oracle.bootMyBatis.model.Emp;


public interface EmpService {
    List<Emp>     list(Emp emp);
    int           total();
	
}
