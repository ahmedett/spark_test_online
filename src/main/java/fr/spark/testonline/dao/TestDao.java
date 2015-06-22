package fr.spark.testonline.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import fr.spark.testonline.entities.Test;

@Repository
public interface TestDao extends CrudRepository<Test, Long>  {

}