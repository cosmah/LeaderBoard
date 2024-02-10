package backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.entity.Tasks;

public interface Tasksrepo extends MongoRepository<Tasks, String>{
    
}
