package backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.entity.People;

public interface PeopleRepository extends MongoRepository<People, String>{

} 