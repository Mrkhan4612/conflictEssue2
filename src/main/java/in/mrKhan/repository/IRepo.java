package in.mrKhan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mrKhan.entities.Student;

public interface IRepo extends JpaRepository<Student, Serializable> {

}
