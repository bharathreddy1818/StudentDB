package com.vedait.Basics.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vedait.Basics.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
//	@Query("select s.marks from student s where s.rollNo=:rollNo")
//	int getmarks(@Param("rollNo") int rollNo);

}
