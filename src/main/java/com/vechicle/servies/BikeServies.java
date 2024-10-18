package com.vechicle.servies;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vechicle.DAO.BikeDAO;
import com.vechicle.Entity.Bike;

@Service
public class BikeServies {
@Autowired
BikeDAO ed;

public String post1(@RequestBody List<Bike>b) {
	return ed.post1(b);
	
}
public List<Bike>get1() {
	return ed.get1();
}

public String putt(int a, Bike bb) {
	return ed.putt(a,bb);
}
public String patch(int b,Bike v) {
	return ed.patch(b,v);
}
public List<Bike>getExpensive() {
	List<Bike> bikes=ed.get1();
	List<Bike> bbe=bikes.stream().filter(x->x.getPrice()>100000).collect(Collectors.toList());
	return bbe;
}
public List<String> getExpenbrand() {
//	List<Bike>br=ed.getExpensive();
//	List<String> be=ed.get1().stream().filter(w->w.getPrice()>100000).map(x->x.getBrand()).collect(Collectors.toList());
	List<String>br=getExpensive().stream().map(a->a.getBrand()).collect(Collectors.toList());
	return br;
}
public List<String>getee() {
	List<Bike> bikes=ed.get1();
	List<String>cc=bikes.stream().filter(a->a.getColour().equals("black")).map(x->x.getBrand()+" = "+x.getPrice()).collect(Collectors.toList());
	return cc;
	
	
}
public int getmax() {
	List<Bike> bikes=ed.get1();
	int max=bikes.stream().map(e->e.getPrice()).sorted(Comparator.reverseOrder()).distinct().findFirst().get();
	return max;
	
}
public Bike getm() {
	List<Bike> bikes=ed.get1();
	Bike er=bikes.stream().sorted(Comparator.comparing(Bike::getPrice).reversed()).distinct().findFirst().get();
	return er;
	
}
public Bike getmin() {
	List<Bike> bikes=ed.get1();
	Bike eer=bikes.stream().sorted(Comparator.comparing(Bike::getPrice)).distinct().findFirst().get();
	return eer;
	
} 



}
