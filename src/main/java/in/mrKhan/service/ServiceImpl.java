package in.mrKhan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mrKhan.entities.Student;
import in.mrKhan.repository.IRepo;

@Service
public class ServiceImpl implements IService {

	@Autowired
	IRepo studentRepository;

	// getting all books record by using the method findaAll() of CrudRepository
	public List<Student> getAllStudents() {
		List<Student> student = new ArrayList<Student>();
		studentRepository.findAll().forEach(student1 -> student.add(student1));
		return student;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Student getStudentsById(int id) {
		return studentRepository.findById(id).get();
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
}
