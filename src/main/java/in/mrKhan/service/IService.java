package in.mrKhan.service;

import java.util.List;

public interface IService {
public List<Student> getAllStudents();
	public Student getStudentsById(int id);
	public void delete(int id);

}
