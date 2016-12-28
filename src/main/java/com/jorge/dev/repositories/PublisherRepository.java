package com.jorge.dev.repositories;

import com.jorge.dev.models.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Jorge on 27/12/16.
 */

@RepositoryRestResource(collectionResourceRel = "caleb", path = "publisher")
public interface PublisherRepository extends MongoRepository<Publisher, String> {

    List<Publisher> findBySurname(@Param("surname") String surname);

}