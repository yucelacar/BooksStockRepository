package com.bookstock.repository;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query; 
import org.springframework.stereotype.Repository;

import com.bookstock.entity.Books;
@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>{
	@Query(value = "select * from books where book_name like %?1%" , nativeQuery = true)
	List<Books> getBooksByName(String name);
	
	@Transactional
	@Modifying // delete ve update yaparken transactional ve modifyg annotationlari eklenmeli
	@Query(value = "delete from books where writer_id = ?1" , nativeQuery = true)
	int deleteBooksByWriter(int writerId);
}
