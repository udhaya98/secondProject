package com.vechicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vechicle.Entity.Bike;
import com.vechicle.servies.BikeServies;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/bike")
public class BikeController {
	@Autowired
	BikeServies es;
	@PostMapping("/postall")
	public String post1(@RequestBody List<Bike>b) {
		
		return  es.post1(b);
	}
	@GetMapping("/getall")
	public List<Bike> get1() {
		return es.get1();
	}
	@PutMapping("/put1/{a}")
	public String putt(@PathVariable int a,@RequestBody Bike bb) {
		return es.putt(a,bb);
	}
	@PatchMapping("patch/{b}")
	public String patch(@PathVariable int b,@RequestBody Bike v) {
		return es.patch(b,v);
		
	}
	@GetMapping("/getal")
	public List<Bike>getExpensive() {
		return es.getExpensive();
	}
	@GetMapping("/getbl")
	public List<String>getExpenbrand() {
		return es.getExpenbrand();
	}
	@GetMapping(value="/getee")
	public List<String>getee() {
		return es.getee();
	}
	@GetMapping("/max")
	public int getmax() {
		return es.getmax();
	}
	@GetMapping("/maxobj")
	public Bike getm() {
		return es.getm();
	}
	@GetMapping("/minobj")
	public Bike getmin() {
		return es.getmin();
	}
	
	
	
	
	
	
}