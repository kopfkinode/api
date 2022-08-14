// /*
package com.example.api.repo;

import com.example.api.entity.Publication;
import com.example.api.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPublisherRepository extends JpaRepository<Publisher, Long> {

    @Query(nativeQuery = true, value = "SELECT DISTINCT p.publisherName FROM publisher as p WHERE p.publisherName = publisherName")
    List<Object[]>findAllPublicationByPublisher(String publisher);

    List<Publisher> findAllByPublisherNameAndPublisher(String publisher, String name);


}

// */