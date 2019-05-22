package PAII.ConnectMongoDB.repository;

import PAII.ConnectMongoDB.entity.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String> {
    
}
