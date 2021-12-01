package com.oracle.bootMyBatis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.bootMyBatis.dao.EmpDao;
import com.oracle.bootMyBatis.model.Emp;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
	private   EmpDao  ed;

	@Override
	public List<Emp> list(Emp emp) {
		// TODO Auto-generated method stub
		return ed.list(emp);
	}
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return ed.total();
	}
	
	
}
