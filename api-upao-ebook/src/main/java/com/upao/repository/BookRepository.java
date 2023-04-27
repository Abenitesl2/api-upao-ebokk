package com.upao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.upao.domain.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
