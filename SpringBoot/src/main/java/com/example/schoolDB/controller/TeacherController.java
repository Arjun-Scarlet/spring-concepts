package com.example.schoolDB.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.schoolDB.entity.Teacher;
import com.example.schoolDB.repository.TeacherRepository;

@Controller
public class TeacherController {
	@Autowired
	TeacherRepository tr;
	
	@GetMapping("/home")
	public String login() {
		System.out.println("Home is Triggered!");
		return "home"; 
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Teacher teacher) {
		tr.save(teacher);
		System.out.println("Teacher Data Registered!");
		return "welcome"; 
	}
	
	@PutMapping("/updateTeacher")
	@ResponseBody
	public ResponseEntity<ResponseStructure<Teacher>> update(@ModelAttribute Teacher teacher) {
		Optional<Teacher> o1 = tr.findById(teacher.getId());
		if(o1.isPresent()) {
			Teacher t1 = o1.get();
			t1.setName(teacher.getName());
			t1.setEmail(teacher.getEmail());
			tr.save(t1);
			System.out.println(t1+"\n");
			ResponseStructure<Teacher> rs = new ResponseStructure<Teacher>(200, "OK", t1);
			return new ResponseEntity<>(rs, HttpStatus.CREATED);  
		}
		else {
			ResponseStructure<Teacher> rs = new ResponseStructure<Teacher>(204, "No Content", null);
			return new ResponseEntity<>(rs, HttpStatus.BAD_REQUEST); 
		}
	}
	
	@DeleteMapping("/deleteTeacher/{id}")
	@ResponseBody 
	public ResponseEntity<ResponseStructure<String>> delete(@PathVariable int id) {
		boolean flag = tr.existsById(id);
		if(flag) {
			tr.deleteById(id);
			System.out.println("Teacher Id: "+id+" is deleted!"+"\n");
			ResponseStructure<String> rs = new ResponseStructure<String>(200, "OK", "Teacher Id:"+id+" Deleted");
			return new ResponseEntity<>(rs, HttpStatus.CREATED);  
		}
		else {
			ResponseStructure<String> rs = new ResponseStructure<String>(204, "No Content", null);
			return new ResponseEntity<>(rs, HttpStatus.BAD_REQUEST); 
		}
	}
	
	@GetMapping("/fetchTeacher")
	@ResponseBody
	public ResponseEntity<ResponseStructure<List<Teacher>>> fetch() {
		List<Teacher> list = tr.findAll();
		if(!list.isEmpty()) {
			System.out.println("Teacher Details:");
			for(Teacher i: list) {
				System.out.println(i);
			}
			System.out.println();
			ResponseStructure<List<Teacher>> rs = new ResponseStructure<List<Teacher>>(200, "OK", list);
			return new ResponseEntity<>(rs, HttpStatus.CREATED);  
		}
		else {
			ResponseStructure<List<Teacher>> rs = new ResponseStructure<List<Teacher>>(204, "No Content", null);
			return new ResponseEntity<>(rs, HttpStatus.BAD_REQUEST); 
		}
	}
	
	@GetMapping("/fetchByEmail")
	@ResponseBody
	public ResponseEntity<ResponseStructure<List<Teacher>>> fetchByEmail(@RequestParam String email){
		List<Teacher> list = tr.findByEmail(email);
		if(!list.isEmpty()) {
			ResponseStructure<List<Teacher>> rs = new ResponseStructure<List<Teacher>>(200, "OK", list);
			return new ResponseEntity<>(rs, HttpStatus.CREATED);  
		}
		else {
			ResponseStructure<List<Teacher>> rs = new ResponseStructure<List<Teacher>>(204, "No Content", null);
			return new ResponseEntity<>(rs, HttpStatus.BAD_REQUEST); 
		}
	}
}
