package com.oracle.bootMyBatis.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.bootMyBatis.model.Emp;
import com.oracle.bootMyBatis.service.EmpService;
import com.oracle.bootMyBatis.service.Paging;
@Controller
public class EmpController {
	@Autowired
	private EmpService es;
	
	// EmpService es = new EmpServiceImpl()
	@RequestMapping(value="list")
	public String list(Emp emp, String currentPage, Model model) {
		int total = es.total();   // Emp Count -> 17
		System.out.println("total=>" + total);
		System.out.println("currentPage=>" + currentPage);
		//                     14     NULL(0,1....)
		Paging pg = new Paging(total, currentPage);
		emp.setStart(pg.getStart());   // 시작시 1
		emp.setEnd(pg.getEnd());     // 시작시 10 
		List<Emp> list = es.list(emp);
//		String status = es.idCompare(id1,id2);
		
	//	model.addAttribute("k33","k33333");
		model.addAttribute("list",list);
		model.addAttribute("pg",pg);
		return "list";
	}

	  
}