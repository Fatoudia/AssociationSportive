package com.simplon.gym.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.gym.dao.GymnaseDao;
import com.simplon.gym.model.Gymnases;

@Service
public class GymnaseServiceImpl implements GymnaseInterService {

	@Autowired
	private GymnaseDao dao;

	@Override
	public void createGymnase(List<Gymnases> gym) {
		dao.saveAll(gym);
		
	}

	@Override
	public Collection<Gymnases> getAllGymnase() {
		System.out.println("Je suis dans le serviceimpl");
		System.out.println(dao.findAll());
		return dao.findAll();
	}
	
	

	@Override
	public Gymnases updateGymnase(Gymnases gyme) {

	return	dao.save(gyme);
		
	}

	@Override
	public void deleteAllGymnase() {

		dao.deleteAll();
	}

	@Override
	public void createGymnase(Gymnases gyme) {

		dao.save(gyme);
	}

	@Override
	public Optional<Gymnases> findGymnaseById(String id) {
		System.out.println("l'id recherche est"+ id);
		return dao.findById(id);
	}

	@Override
	public void deleteGymnaseById(String id) {
		System.out.println("l'id supprimé est"+ id);

		dao.deleteById(id);
	}

}
