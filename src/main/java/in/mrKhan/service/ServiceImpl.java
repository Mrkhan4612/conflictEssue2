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

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}

	// updating a record
	public void update(Student student, int sudentid) {
		studentRepository.save(student);
	}
}
