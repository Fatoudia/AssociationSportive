package com.simplon.gym.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.simplon.gym.model.Gymnases;


@Service
public interface GymnaseInterService {
	public void createGymnase(List<Gymnases> gym);
	public void createGymnase(Gymnases gyme);

	public Collection<Gymnases> getAllGymnase();
	public Optional<Gymnases> findGymnaseById(String id);
	public void deleteGymnaseById(String id);
	public Gymnases updateGymnase(Gymnases gyme);
	public void deleteAllGymnase();

}
