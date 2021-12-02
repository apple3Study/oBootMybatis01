package com.oracle.bootMyBatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.bootMyBatis02.model.Emp;
import com.oracle.bootMyBatis02.model.SampleVO;
import com.oracle.bootMyBatis02.service.EmpService;

 
@RestController
public class EmpRestController {
	@Autowired
    private EmpService es;
	
	@RequestMapping("/")
	public SampleVO start() {
		SampleVO  vo = new SampleVO();
		System.out.println("EmpRestController / Start...");
		vo.setFirstName("start");
		vo.setLastName("...");
	    vo.setMno(11);
		return   vo;
	}
	@RequestMapping("sendVO")
	public SampleVO sendVO() {
		SampleVO  vo = new SampleVO();
		vo.setFirstName("개소문");
		vo.setLastName("연");
	    vo.setMno(123);
		return   vo;
	}
	@RequestMapping("/hello")
	public SampleVO hello() {
		SampleVO  vo = new SampleVO();
		vo.setFirstName("hello");
		vo.setLastName("연");
	    vo.setMno(123);
		return   vo;
	}
	
	@RequestMapping("/sendVO2")
	public SampleVO sendVO2(int deptno) {
		  System.out.println("@RestController deptno->"+deptno);
		  SampleVO vo = new SampleVO();
		  vo.setFirstName("길동");
		  vo.setLastName("홍");
		  vo.setMno(deptno);
		  return vo;
	}	
	
	@RequestMapping("/sendVO3")
	public List<Emp> sendVO3() {
		System.out.println("@RestController sendVO3  START");
		Emp emp = new Emp();
		emp.setStart(1);   // 시작시 1
		emp.setEnd(10);     // 시작시 10 
		List<Emp> listEmp = es.listEmp(emp);
		System.out.println("@RestController sendVO3  listEmp.size()->"+listEmp.size());
		return listEmp;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
