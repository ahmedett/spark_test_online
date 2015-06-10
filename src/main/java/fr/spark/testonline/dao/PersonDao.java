package fr.spark.testonline.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.spark.testonline.entities.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Long> {

}
