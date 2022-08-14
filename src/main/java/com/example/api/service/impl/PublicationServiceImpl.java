package com.example.api.service.impl;

import com.example.api.entity.Publication;
import com.example.api.entity.Publisher;
import com.example.api.repo.IPublicationRepository;
import com.example.api.service.IPublisherService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl {

    private final IPublicationRepository repository;


    public PublicationServiceImpl(IPublicationRepository repository) {
        this.repository = repository;
    }

    public List<Publication> findAllPublication() {
        return repository.findAll();
    }


}
