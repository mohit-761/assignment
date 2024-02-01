package com.student.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.entity.Student;
import com.student.repo.StudentRepo;

@Controller
public class StudentController {
	@Autowired
	private StudentRepo studentRepo;

	//Add Student data
	@PostMapping("/save")
	@ResponseBody
	public String addStudent(@RequestBody Student student) {
		Student std = studentRepo.save(student);
		if (std != null)
			return "student record inserted";
		else
			return "student record does not inserted";
	}
	
	//update record
	@PostMapping("/update/{id}")
	@ResponseBody
	public String updateRecord(@PathVariable int id, @RequestBody Student studentNewRecord) {
		Student studentOldRecord = studentRepo.findById(id).get();
		
		//replacing old records with new records
		if(studentOldRecord!=null) {
			studentOldRecord.setSname(studentNewRecord.getSname());
			studentOldRecord.setCity(studentNewRecord.getCity());
			studentOldRecord.setCourse(studentNewRecord.getCourse());
			studentOldRecord.setmobileNo(studentNewRecord.getmobileNo());
			studentRepo.save(studentOldRecord);
			return "record updated successfully";
		}
		else {
			return "record not found";
		}
	}
	
	//delete record
		@GetMapping("/delete/{id}")
		@ResponseBody
		public String deleteRecord(@PathVariable int id) {
				  	studentRepo.deleteById(id);
				  	return "Record deleted succesfully";
		}
	
	//Getting all record
	@GetMapping("/select")
	@ResponseBody
	public List<Student> viewAllStudents() {
		return (List<Student>)studentRepo.findAll();
	}
	
	//Getting one record
	@GetMapping("/selectOne/{id}")
	@ResponseBody
	public Optional<Student> viewOneStudent(@PathVariable int id){
		return (Optional<Student>) studentRepo.findById(id);
	}
}
