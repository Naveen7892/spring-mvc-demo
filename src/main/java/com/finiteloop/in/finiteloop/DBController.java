package com.finiteloop.in.finiteloop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/db")
public class DBController {
	
	@Autowired
	public DBService dbService; 
	
	@RequestMapping(value = "/dblist", method = RequestMethod.GET)
	public List<DB> getName() {
		return dbService.getDbList();
	}
	
	@RequestMapping(value = "/id", method = RequestMethod.POST)
	public DB getId(@RequestParam Long id) {
		return dbService.getDb(id);
	}
	
}
