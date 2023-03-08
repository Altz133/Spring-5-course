package com.example.SectionOne.bootstrap;
import com.example.SectionOne.domain.Author;
import com.example.SectionOne.domain.Book;
import com.example.SectionOne.domain.Publisher;
import com.example.SectionOne.repositories.AuthorRepository;
import com.example.SectionOne.repositories.BookRepository;
import com.example.SectionOne.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner { //dependency injection Section 2 Lecture 17
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void run(String... args) throws Exception {


        Publisher publisher = new Publisher();
        publisher.setName("Polish Publisher");
        publisher.setCity("Szczecin");
        publisher.setState("PL");

        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd= new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBookSet().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod","Jhonson");
        Book noEJB= new Book("J2EE Development without EJB", "534345");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBookSet().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Publisher Count "+ publisherRepository.count());
        System.out.println("Number of Books: "+ bookRepository.count());
        System.out.println("Publisher number of books "+ publisher.getBookSet().size());
    }
}
