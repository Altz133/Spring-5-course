package com.example.SectionOne.repositories;

import com.example.SectionOne.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
