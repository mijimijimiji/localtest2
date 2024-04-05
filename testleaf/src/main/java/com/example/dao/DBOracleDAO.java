package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.Dept;

@Repository
public class DBOracleDAO  {
	
	@Autowired
	SqlSessionTemplate session;

	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		return session.selectList("selectAll");
	}
	
	

}
