package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DBOracleDAO;
import com.example.dto.Dept;

@Service
public class TestService {
	
	@Autowired
	DBOracleDAO dao;

	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
	

}
