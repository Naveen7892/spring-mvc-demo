package com.finiteloop.in.finiteloop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<DB> getName(@RequestParam(defaultValue  = "0", required = false) long id) {
		if(id == 0) 
			return dbService.getDbList();
		else {
			List<DB> l = new ArrayList<DB>();
			l.add(dbService.getDb(id));
			return l;
		}
	}
	
//	@RequestMapping(value = "/id", method = RequestMethod.POST)
//	public DB getId(@RequestBody Long id) {
//		return dbService.getDb(id);
//	}
	
	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public void saveDb(@RequestBody DB db) {
		dbService.saveDB(db);
	}
	
	@RequestMapping(value = "/data", method = RequestMethod.DELETE)
	public void saveDb(@RequestBody Long id) {
		dbService.deleteDB(id);
	}
	
}
