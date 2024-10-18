package com.vechicle.Repositry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vechicle.Entity.Car;



public interface CarRepositry extends JpaRepository<Car, Integer>{
	@Query(value="select *from car_details where price>? and price<?",nativeQuery=true)
	public List<Car>getByPrice(int b,int c);
	
	@Query(value="select *from car_details where colour like?",nativeQuery=true)
	public List<Car>getByColour(String y);
	@Query(value="select * from car_details where price=(select max(price) from car_details price)",nativeQuery=true)
	public List<Car>getmax();
	@Query(value="select brand,price from car_details where colour=?",nativeQuery=true)
	public List<Object>getobj(String c);
	@Query(value="select count(colour) from car_details where colour=?",nativeQuery=true)
	public int getcount(String d);
	@Query(value="select colour,count(colour) from car_details group by colour",nativeQuery=true)
	public List<Object> getcc();
	@Query(value="select x from Car x where colour=:b")
	public List<Car>jcolor(@Param("b")String b);
	@Query(value="select x from Car x where price>:a and price<:b") 
	public List<Car>findprice(@Param("a") int a,@Param("b") int b);
	@Query(value="select max(price) from Car")
	public int findmaxj();
	@Query(value="select x from Car x where x.price=(select max(x.price) from Car)")
	public List<Car>objmax();
	@Query(value="select x from Car x order by x.price desc limit 1,1)")
	public List<Car>objsec();
	@Query(value="Select x from Car x where x.colour like ':o%' ")
	public List<Car>objb(@Param("o") char o);
	
}

