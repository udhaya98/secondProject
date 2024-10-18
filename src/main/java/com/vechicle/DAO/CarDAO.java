package com.vechicle.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.vechicle.Entity.Car;
import com.vechicle.Repositry.CarRepositry;

@Repository
public class CarDAO {
@Autowired
CarRepositry cr;

public String post1(@RequestBody List<Car>c) {
	cr.saveAll(c);
	return "Post succesfully";
}

public List<Car>get1() {
	return cr.findAll();
}
public List<Car>getByPrice(int b,int a) {
	return cr.getByPrice(b,a);
}
public List<Car>getByColour(String a) {
	return cr.getByColour(a);
}
public List<Car>getmax() {
	return cr.getmax();
}
public List<Object>getobj(String f) {
	return cr.getobj(f);
}
public int getcount(String d) {
	return cr.getcount(d);
}
public List<Object> getcc() {
	return cr.getcc();
}
public List<Car>jcolor( String b) {
	return cr.jcolor(b);
}
public List<Car> findprice( int a, int b) {
	return cr.findprice(a,b);
}
public int findmaxj() {
	return cr.findmaxj();
}
public List<Car>objmax() {
	return cr.objmax();
}
public String findid(int a) {
String rr=cr.findById(a).get().getBrand();
return rr;
}
public List<Car>objsec() {
	return cr.objsec();
}
public List<Car>objb(char o) {
	return cr.objb(o);
}
}
