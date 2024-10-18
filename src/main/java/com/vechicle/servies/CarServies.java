package com.vechicle.servies;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.vechicle.DAO.CarDAO;
import com.vechicle.Entity.Car;

@Service
public class CarServies {
	@Autowired
	CarDAO cd;
	
	public String post1(@RequestBody List<Car>c) {
		return cd.post1(c);
	}
	
	public List<Car>get1() {
		return cd.get1();
	}
	public List<Car>getByPrice(int b,int a) {
		return cd.getByPrice(b,a);
	}
	public List<Car>getByColour(String a) {
		return cd.getByColour(a);
	}
	public List<Car>getmax() {
		return cd.getmax();
	}
	public List<Object>getobj(String f) {
		return cd.getobj(f);
	}
	public int getcount( String d) {
		return cd.getcount(d);
	}
	public List<Object> getcc() {
		return cd.getcc();
	}
	public List<Car>jcolor( String b) {
		return cd.jcolor(b);
	}
	public List<Car> findprice( int a, int b) {
		return cd.findprice(a,b);
	}
	public int findmaxj() {
		return cd.findmaxj();
	}
	public List<Car>objmax() {
		return cd.objmax();
	}
	public List<Car>objsec() {
		return cd.objsec();
	}
	public List<Car>objb( char o) {
		return cd.objb(o);
	}
	public String findid(int a) {
		return cd.findid(a);
	}

}
