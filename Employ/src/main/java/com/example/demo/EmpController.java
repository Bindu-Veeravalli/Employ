package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	EmpRepo emprepo;
	@GetMapping("/findall")
	public List<Employee> getall(){
		//System.out.print("Get");
		return emprepo.findAll();
	}
	
	@PostMapping("/employees")
	public Employee create( @RequestBody Employee employee)
	{
		System.out.print("create");
		return emprepo.save(employee);
	}

}
