package com.example.dayy3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dayy3.Model.Employee;
import com.example.dayy3.Service.Eser;

@RestController
public class Econ {
	@Autowired
  Eser ser;
	@PostMapping("add")
	public Employee adddata(@RequestBody Employee e) {
		return ser.saveinfo(e);
	}
	@GetMapping("print")
	public List<Employee> show(){
		return ser.show();
	}

}