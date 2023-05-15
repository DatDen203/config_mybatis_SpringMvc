package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.StudentDaoImpl;
import com.example.Model.StudentDto;

@Service
public class StudentServiceImp implements IStudentService{

	@Autowired
	StudentDaoImpl dao;
	
	@Autowired
	public List<StudentDto> GetListStudent() {
		return dao.GetListStudent();
	}

}
