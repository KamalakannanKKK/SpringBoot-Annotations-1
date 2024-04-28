package com.example.Task31.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Task31.Component.DemoComponent;
import com.example.Task31.Service.DemoService;

@Controller
public class DemoController {
	@Autowired
	DemoService demoservice;

	@RequestMapping("hello")
	@ResponseBody
	public String HelloMessage() {
		return "Hello User";
	}

	@RequestMapping("getAll")
	@ResponseBody
	public List<DemoComponent> listall() {
		return this.demoservice.listall();
	}
	
	@RequestMapping("getById/{id}")
	@ResponseBody
	public DemoComponent getbyId(@PathVariable(value="id")int id) {
		return this.demoservice.getById(id);
	}
}
