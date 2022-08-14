///*
package com.example.api.controller;

import com.example.api.entity.Publication;
import com.example.api.entity.Publisher;
import com.example.api.repo.IPublisherRepository;
import com.example.api.service.impl.PublicationServiceImpl;
import com.example.api.service.impl.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PublisherController {

    @Autowired
    PublisherServiceImpl publisherService;


    @GetMapping("/publisher/{publisher}")
    public ResponseEntity<List<Object[]>> getAllPublicationByPublisher(@PathVariable("publisher") String publisher) {
        List<Object[]> nameList = publisherService.findAllPublicationByPublisher(publisher);
        return new ResponseEntity<>(nameList, HttpStatus.OK);
    }
    @GetMapping("/publisher/{publisher}/{name}")
    public ResponseEntity<List<Publisher>> getAllByPublicationAndPublisher(@PathVariable("publisher") String publisher, @PathVariable("name") String name) {
        List<Publisher> detailList = publisherService.findAllByPublisherNameAndPublisher(publisher,name);
        return new ResponseEntity<>(detailList, HttpStatus.OK);
    }
}

// */