package com.decapitator.guruspringappone.devbootStrap;

import com.decapitator.guruspringappone.model.Author;
import com.decapitator.guruspringappone.model.Book;
import com.decapitator.guruspringappone.model.Publisher;
import com.decapitator.guruspringappone.repository.AuthorRepository;
import com.decapitator.guruspringappone.repository.BookRepository;
import com.decapitator.guruspringappone.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
    }
    private void initData(){
        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        Author stephen = new Author("Stephen" , "King");
         Book ddd = new Book("Corn children", "5522", publisher);
         stephen.getBooks().add(ddd);
         ddd.getAuthors().add(stephen);

         authorRepository.save(stephen);
         bookRepository.save(ddd);

         Author tolkien = new Author("John", "Tolkien");
         Book hobbit = new Book("Hobbit", "5544", publisher);
         tolkien.getBooks().add(hobbit);

         authorRepository.save(tolkien);
         bookRepository.save(hobbit);
    }
}
