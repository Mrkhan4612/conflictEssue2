package in.mrKhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mrKhan.entities.Student;
import in.mrKhan.service.IService;

@RestController
public class IMyCotroller {
	@Autowired
	IService Service;

	//creating a get mapping that retrieves all the books detail from the database 
	@GetMapping("/student")
	private List<Student> getAllStudents() 
	{
	return Service.getAllStudents();
	}
	//creating a get mapping that retrieves the detail of a specific book
	@GetMapping("/student/{studentid}")
	private Student getBooks(@PathVariable("studentid") int studentid) 
	{
	return Service.getStudentsById(studentid);
	}
	//creating a delete mapping that deletes a specified book
	@DeleteMapping("/student/{studentid}")
	private void deleteBook(@PathVariable("studentid") int studentid) 
	{
		Service.delete(studentid);
	}

	//creating post mapping that post the book detail in the database
	@PostMapping("/students")
	private int saveBook(@RequestBody Student student) 
	{
		Service.saveOrUpdate(student);
	return student.getStudentId();
	}
	//creating put mapping that updates the book detail 
	@PutMapping("/students")
	private Student update(@RequestBody Student student) 
	{
		Service.saveOrUpdate(student);
	return student;
	}
}
