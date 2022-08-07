package com.PallaviAnde.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PallaviAnde.Model.Emplyoee;
import com.PallaviAnde.Model.Student;
import com.PallaviAnde.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
//SaveData:
	@GetMapping(value="/studentportal",consumes="application/json",produces="application/json")
	public ResponseEntity<Object> saveData(@RequestBody Student student){
		int id = studentService.saveData(student);
		String msg="Your id is: "+id;
		
		return new ResponseEntity<Object>(msg,HttpStatus.OK);
		}
	
//GetAllData:
	@GetMapping(value="/getData",produces="application/json")
	public ResponseEntity<List<Student>> getAllData(){
		List<Student> allData = studentService.getAllData();
		
		return new ResponseEntity<List<Student>>(allData,HttpStatus.OK);
		}
	
//ViewById:
	@GetMapping(value="/view",consumes="application/json",produces="application/json")
	public ResponseEntity<Object> viewById(Student student){
		Integer id = student.getId();
		Student data = studentService.viewById(id);
		
		return new ResponseEntity<Object>(data,HttpStatus.OK);
		}

//DeleteById:
	@GetMapping(value="/deleteId",consumes="application/json",produces="application/json")
	public ResponseEntity<Object> deleteById(@RequestBody Student student){
		Integer id = student.getId();
		boolean byId =studentService.deleteById(id);
		if(byId) {
			return new ResponseEntity<Object>("Id Deleted",HttpStatus.OK);
		}else {
		return new ResponseEntity<Object>("Such Id not present...add correct Id",HttpStatus.BAD_REQUEST);
		}
	}
	
}
