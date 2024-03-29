package br.com.curso.mongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.mongo.domain.User;
import br.com.curso.mongo.service.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll()
	{
		
		return ResponseEntity.ok().body(userService.getAll());
	}

}
