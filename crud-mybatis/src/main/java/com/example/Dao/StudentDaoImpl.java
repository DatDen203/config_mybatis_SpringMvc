package com.example.Dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.Model.StudentDto;

@Repository
public class StudentDaoImpl extends SqlSessionDaoSupport implements IStudentDao{
		
	@SuppressWarnings("unchecked")
	public List<StudentDto> GetListStudent() {
		return getSqlSession().selectList("com.example.Dao.IStudentDao");
	}

}
