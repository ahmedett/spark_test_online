package fr.spark.testonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.spark.testonline.dao.ReponseDao;

import fr.spark.testonline.entities.Reponse;




@Service
public class ReponseServiceImpl extends AbstractCrudService<Reponse, Long>
		implements ReponseService {
	@Autowired
	private ReponseDao reponseDao;

	@Autowired
	public ReponseServiceImpl(ReponseDao  crudRepository) {
		super(crudRepository);
		// TODO Auto-generated constructor stub
		reponseDao = crudRepository;
	}






}
