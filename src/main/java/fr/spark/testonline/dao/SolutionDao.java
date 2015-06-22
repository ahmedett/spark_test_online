package fr.spark.testonline.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




import fr.spark.testonline.entities.Solution;


@Repository
public interface SolutionDao extends CrudRepository<Solution, Long>  {

}