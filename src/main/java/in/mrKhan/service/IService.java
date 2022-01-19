package in.mrKhan.service;

import java.util.List;

import in.mrKhan.entities.Student;

public interface IService {
	public List<Student> getAllStudents();
	public Student getStudentsById(int id);
	public void delete(int id);
}
