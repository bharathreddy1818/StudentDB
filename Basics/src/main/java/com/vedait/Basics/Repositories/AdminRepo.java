package com.vedait.Basics.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vedait.Basics.Model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {
//	@Query("select marks from student s where s.rollNo=:rollNo")
//	public int getmarks(@Param("rollNo") int rollNo);
	
}
