/// *
package com.example.api.service.impl;

import com.example.api.entity.Publication;
import com.example.api.entity.Publisher;
import com.example.api.repo.IPublisherRepository;
import com.example.api.service.IPublisherService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublisherServiceImpl  implements IPublisherService {
    private final IPublisherRepository publisherRepository;


    public PublisherServiceImpl(IPublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Object[]> findAllPublicationByPublisher(String publisher) {
        return publisherRepository.findAllPublicationByPublisher(publisher);
    }

 

    @Override
    public List<Publisher> findAllByPublisherNameAndPublisher(String publisher, String name) {
        return publisherRepository.findAllByPublisherNameAndPublisher(publisher, name);
    }
}

// */