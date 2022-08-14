package com.example.api.controller;


import com.example.api.entity.Publication;
import com.example.api.entity.Publisher;

import com.example.api.service.impl.PublicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PublicationController {

    @Autowired
    PublicationServiceImpl publicationService;

    @GetMapping("/publication/all")
    public ResponseEntity<List<Publication>> getAllReports () {
        List<Publication> publicationList = publicationService.findAllPublication();
        return new ResponseEntity<>(publicationList, HttpStatus.OK);
    }
}
