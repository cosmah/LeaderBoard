package backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.entity.Performance;

public interface PerformanceRepository extends MongoRepository<Performance, String>{

    
} 
