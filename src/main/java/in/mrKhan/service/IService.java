package in.mrKhan.service;

import java.util.List;

import in.mrKhan.entities.Student;

public interface IService {
public void update(Student student, int sudentid);
	public void saveOrUpdate(Student student);
}
