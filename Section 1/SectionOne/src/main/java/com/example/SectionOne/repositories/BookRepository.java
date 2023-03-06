package com.example.SectionOne.repositories;

import com.example.SectionOne.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
