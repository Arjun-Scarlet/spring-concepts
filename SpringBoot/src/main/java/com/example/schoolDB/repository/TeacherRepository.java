package com.example.schoolDB.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.schoolDB.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	//Creating custom method
	@Query("select t from Teacher t where t.email=?1")
	List<Teacher> findByEmail(String email);
}
