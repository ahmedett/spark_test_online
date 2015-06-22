package fr.spark.testonline.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.spark.testonline.entities.Reponse;


@Repository
public interface ReponseDao extends CrudRepository<Reponse, Long> /*
																 * param1 : nom
																 * entité param
																 * 2 : type de
																 * ID
																 */{

}
