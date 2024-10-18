package com.vechicle.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.web.bind.annotation.RequestBody;

import com.vechicle.Entity.Bike;
import com.vechicle.Repositry.BikeRepositry;

@Repository
public class BikeDAO {
@Autowired
BikeRepositry er;
public String post1(@RequestBody List<Bike>b) {
	er.saveAll(b);
	return "post Successfully";
}
public List<Bike>get1() {
	return er.findAll();
	
}
public String putt(int a, Bike bb) {
	er.save(bb);
	return "Put Successfully";
}
public String patch(int b,Bike v) {
	Bike be=er.findById(b).get();
	be.setBrand(v.getBrand());
	er.save(be);
	return "Patch Successfully";
}
public List<Bike>getExpensive() {
	return er.findAll();
}


}
