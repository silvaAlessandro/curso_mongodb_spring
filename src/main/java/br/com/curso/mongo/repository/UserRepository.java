package br.com.curso.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.mongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	

}
