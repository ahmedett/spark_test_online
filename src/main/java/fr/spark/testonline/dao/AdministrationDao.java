package fr.spark.testonline.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.spark.testonline.entities.Administration;



@Repository
public interface AdministrationDao extends CrudRepository<Administration, Long> /*
																 * param1 : nom
																 * entité param
																 * 2 : type de
																 * ID
																 */{

}
