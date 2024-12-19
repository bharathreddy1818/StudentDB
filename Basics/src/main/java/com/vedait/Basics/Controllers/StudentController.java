package com.vedait.Basics.Controllers;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedait.Basics.Model.Student;
import com.vedait.Basics.Repositories.StudentRepo;
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentRepo sRepo;
	@GetMapping("/getdetails/{rollNo}")
	public ResponseEntity<Student> getDetails(@PathVariable int rollNo) {
		return sRepo.findById(rollNo).map(ResponseEntity::ok).orElse((ResponseEntity.notFound().build()));
	}
//	@GetMapping("/getmarks/{rollNo}")
//	public int getmarks(@PathVariable int rollNo) {
//		return sRepo.getmarks(rollNo);
//	}

}
