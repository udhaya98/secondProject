package com.vechicle.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vechicle.Entity.Car;
import com.vechicle.servies.CarServies;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarServies cs;
	@PostMapping("/postall")
	public String post1(@RequestBody List<Car>c) {
		
		return cs.post1(c) ;
	}
	@GetMapping("/getall")
	public List<Car> get1() {
		return cs.get1();
	}
	@GetMapping(value="/getPrice/{b}/{a}")
	public List<Car>getByPrice(@PathVariable int b,@PathVariable int a) {
		return cs.getByPrice(b,a);
	}
	@GetMapping("/getcolor/{a}")
	public List<Car>getByColour(@PathVariable String a) {
		return cs.getByColour(a);
	}
	@GetMapping("/getmax")
	public List<Car> getmax() {
		return cs.getmax();
	}
	@GetMapping("/getob/{f}")
	public List<Object>getobj(@PathVariable String f) {
		return cs.getobj(f);
	}
	@GetMapping("getc/{d}")
	public int getcount(@PathVariable String d) {
		return cs.getcount(d);
	}
	@GetMapping("getcc")
	public List<Object> getcc() {
		return cs.getcc();
	}
	@GetMapping("/jcolor/{b}")
	public List<Car>jcolor(@PathVariable String b) {
		return cs.jcolor(b);
	}
	@GetMapping("/getj/{a}/{b}")
	public List<Car>findprice(@PathVariable int a,@PathVariable int b) {
		return cs.findprice(a,b);
	}
	@GetMapping("/jmax")
	public int findmaxj() {
		return cs.findmaxj();
	}
	@GetMapping("/objmax")
	public List<Car>objmax() {
		return cs.objmax();
	}
	@GetMapping("/objse")
	public List<Car>objsec() {
		return cs.objsec();
	}
	@GetMapping("/objsee/{o}")
	public List<Car>objb(@PathVariable char o) {
		return cs.objb(o);
	}
	@GetMapping("/get30")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}