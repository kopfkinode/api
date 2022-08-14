///*
package com.example.api.service;


import com.example.api.entity.Publication;
import com.example.api.entity.Publisher;

import java.util.List;

public interface IPublisherService {
    List<Object[]> findAllPublicationByPublisher(String publisher);

    List<Publisher> findAllByPublisherNameAndPublisher(String publisher, String name);

}

// */