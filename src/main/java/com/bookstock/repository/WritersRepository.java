package com.bookstock.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bookstock.entity.Writers;

public interface WritersRepository extends JpaRepository<Writers, Integer>{
	@Query(value = "select * from writers where name = ?1" , nativeQuery = true)
	Writers getWriterByName(String name);
	
	@Transactional
	@Modifying
	@Query(value = "delete from writers where id = ?1" , nativeQuery = true)
	int deleteWriterById(int writerId);
}
