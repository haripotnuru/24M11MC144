package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
    private BookRepository bookRepository;
	

    // Insert sample data if empty
    @GetMapping("/init")
    public String initData() {
        if (bookRepository.count() == 0) {
            bookRepository.save(new Book("Spring Boot Basics", "John"));
            bookRepository.save(new Book("Java Programming", "Alice"));
            bookRepository.save(new Book("Hibernate in Action","Bob"));
            bookRepository.save(new Book("Microservices Guide", "Carol"));
            bookRepository.save(new Book("Data Structures", "Davidraj"));
                   }
        return "Sample books added!";
    }

    // Pagination + Sorting end point
    @GetMapping
    public Page<Book> getBooks(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @RequestParam(defaultValue = "title") String sortBy,
            @RequestParam(defaultValue = "asc") String direction
    ) {
        Sort sort = direction.equalsIgnoreCase("asc") ?
                Sort.by(sortBy).ascending() :
                Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(page, size, sort);
        return bookRepository.findAll(pageable);
    }


}
