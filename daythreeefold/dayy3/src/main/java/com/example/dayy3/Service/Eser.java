package com.example.dayy3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dayy3.Model.Employee;
import com.example.dayy3.Repository.Erep;

@Service
public class Eser {
  @Autowired
	Erep re;
  public Employee saveinfo(Employee e) {
	  return re.save(e);
  }
  public List<Employee> show(){
	  return re.findAll();
  }
}