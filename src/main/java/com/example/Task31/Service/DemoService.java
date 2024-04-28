package com.example.Task31.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Task31.Component.DemoComponent;
import com.example.Task31.Exception.NoDataFoundException;
import com.example.Task31.Exception.ResourceNotFoundException;

@Service
public class DemoService {

	private static List<DemoComponent> list = new ArrayList<>();

	static {
		list.add(new DemoComponent(1, "Kamal", "Male"));
		list.add(new DemoComponent(2, "Kannan", "Male"));
		list.add(new DemoComponent(3, "Tiyasha", "Female"));
	}

	public List<DemoComponent> listall() {
		if (list.isEmpty()) {
			throw new NoDataFoundException("User Data Not Found");
		}
		return list;}

	public DemoComponent getById(int id) {
		Optional<DemoComponent> democomponent = list.stream().filter(e -> e.getId() == id).findFirst();
		if(!democomponent.isPresent()) {
			throw new ResourceNotFoundException("User with ID: " +id+" Not Found" );
		}
		return democomponent.get();
	}

}
