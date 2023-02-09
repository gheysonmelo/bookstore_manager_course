package com.gheysonmelo.bookstoremanager.repository;

import com.gheysonmelo.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
