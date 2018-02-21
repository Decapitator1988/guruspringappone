package com.decapitator.guruspringappone.repository;

import com.decapitator.guruspringappone.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
