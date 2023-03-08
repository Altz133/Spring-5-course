package com.example.SectionOne.controllers;

import com.example.SectionOne.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("author",authorRepository.findAll());

        return "author/list";
    }
}
