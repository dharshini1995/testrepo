package com.springboot.watertank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.watertank.entity.UseWater;
import com.springboot.watertank.repository.WaterRepository;



@RestController
@RequestMapping("/water")
public class WaterController {
	
	
	@Autowired
	private WaterRepository waterrepository;
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcome to get free snacks";
		
	}
	
	@RequestMapping("/welcome/free")
	
	public String welcomefree()
	{
		return "welcome to get free snacks";
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addWater(@RequestBody UseWater usewater)
	{
		waterrepository.save(usewater);
		return "Saved the water in water tank: " + usewater.getQuantity() + " " + usewater.getContainer();
		
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteWater(@PathVariable Integer id) {
		
		waterrepository.delete(id);
		return "Emptied water in water tank";
		
	}
	
	
	@RequestMapping("/getallwater")
	public List<UseWater> getAllWater()
	{
		List<UseWater> allWater=new ArrayList<>();
		waterrepository.findAll().forEach(allWater::add);
		return allWater;
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/update/{id}")
	public String update(@RequestBody UseWater usewater ,@PathVariable Integer id)
	{
		usewater.setId(id);
	    waterrepository.save(usewater);

		return "updated";
		
	}

}
