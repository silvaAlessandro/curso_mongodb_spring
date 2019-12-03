package br.com.curso.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.mongo.domain.User;
import br.com.curso.mongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll()
	{	
		List<User> retorno = userRepository.findAll(); 
		return retorno;
	}

}
