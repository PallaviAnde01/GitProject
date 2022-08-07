package com.PallaviAnde.Service;

import java.util.List;

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

	@Override
	public List<Student> getAllData() {
		List<Student> list = studentDao.findAll();
		return list;
	}

	@Override
	public Student viewById(Integer id) {
		Student student = studentDao.findById(id).get();
		return student;
	}

	@Override
	public boolean deleteById(Integer id) {
		boolean byId = studentDao.existsById(id);
		if(byId) {
			studentDao.deleteById(id);
		return true;	
		}else {
		return false;
		}
	}

}
