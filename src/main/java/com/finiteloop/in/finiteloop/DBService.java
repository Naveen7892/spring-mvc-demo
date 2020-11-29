package com.finiteloop.in.finiteloop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
	
	@Autowired
	public DBRepository dbRespository;
	
	public List<DB> getDbList() {
		return dbRespository.findAll();
	}
	
	public DB getDb(long id) {
		return dbRespository.findById(id);
	}

	public void saveDB(DB db) {
		dbRespository.save(db);
	}
	
	public void deleteDB(long id) {
		dbRespository.deleteById(id);
	}
}
