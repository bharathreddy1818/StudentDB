package com.vedait.Basics.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedait.Basics.Model.Student;
import com.vedait.Basics.Model.Teacher;
import com.vedait.Basics.Repositories.StudentRepo;
import com.vedait.Basics.Repositories.TeacherRepo;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	StudentRepo sRepo;
	@Autowired
	TeacherRepo tRepo;
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student s) {
		sRepo.save(s);
	
	}
	@DeleteMapping("/deleteStudent/{rollNo}")
	public void deleteStudent(@PathVariable int rollNo) {
		sRepo.deleteById(rollNo);		
	}
	@PutMapping("/editStudent")
	public void editStudent(@RequestBody Student s) {
		sRepo.save(s);
	}
	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return sRepo.findAll();
	}
	@GetMapping("/getStudent/{rollNo}")
	public ResponseEntity<Student> getStudent(@PathVariable int rollNo) {
		return sRepo.findById(rollNo).map(ResponseEntity::ok).orElse((ResponseEntity.notFound().build()));
	}
	@GetMapping("/getTeacher/{rollNo}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable int id) {
		return tRepo.findById(id).map(ResponseEntity::ok).orElse((ResponseEntity.notFound().build()));
	}

}
	
