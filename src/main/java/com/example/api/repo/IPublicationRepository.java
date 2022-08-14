package com.example.api.repo;

import com.example.api.entity.Publication;
import com.example.api.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublicationRepository extends JpaRepository<Publication, Long> {

}
