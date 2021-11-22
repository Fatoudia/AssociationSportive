package com.simplon.gym.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.gym.dao.GymnaseDao;
import com.simplon.gym.model.Gymnases;
import com.simplon.gym.service.GymnaseInterService;

//Web service rest:
@RestController
@RequestMapping("/gymnas")
public class GymnaseController {
	
//	@Qualifier(value = "gymnase")
	@Autowired
	private GymnaseInterService gymnaseService;
	
	@Autowired
	private GymnaseDao gymnasedao;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/resource")
	public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("content", "Hello World");
	    return model;
	  }
	
	@GetMapping
//	@ResponseStatus(HttpStatus.OK)
	public Collection<Gymnases> findAllGymnase(){
		System.out.println("testte getAllGymnase" + gymnaseService.getAllGymnase());
		logger.debug("Getting all gymnases.");
		return gymnaseService.getAllGymnase();
			
	}
	
	@PostMapping("/add")
	public void insertGymnase(@RequestBody Gymnases gym) {
		System.out.println("test insert");
		this.gymnaseService.createGymnase(gym);
	}
	
	
	@DeleteMapping
	public void insertAllGymnase(@RequestBody Gymnases gym) {
		this.gymnaseService.deleteAllGymnase();
	}
	
	@GetMapping("gym/{id}")
	public Optional<Gymnases> findGymnById(@PathVariable String id){
		return this.gymnaseService.findGymnaseById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<Gymnases> updateEmployee(@RequestBody Gymnases gymnase) {
		Gymnases updateGymnase = this.gymnaseService.updateGymnase(gymnase);
        return new ResponseEntity<>(updateGymnase, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteGymnase(@PathVariable String id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.gymnaseService.deleteGymnaseById(id);
	}
}

