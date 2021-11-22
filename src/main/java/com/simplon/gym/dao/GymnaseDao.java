package com.simplon.gym.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.simplon.gym.model.Gymnases;

/* mofiication */
@Repository
public interface GymnaseDao extends MongoRepository<Gymnases, String>  {


}
