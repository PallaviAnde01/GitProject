package com.PallaviAnde.Service;

import java.util.List;

import com.PallaviAnde.Model.Student;

public interface StudentService {

	public int saveData(Student student);
	public List<Student> getAllData();
}
