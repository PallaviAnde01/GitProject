package com.PallaviAnde.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PallaviAnde.Model.Student;
import com.PallaviAnde.Repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public int saveData(Student student) {
		Student save = studentDao.save(student);
		Integer id = save.getId();
		return id;
	}

}
