package fr.spark.testonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.spark.testonline.dao.SolutionDao;

import fr.spark.testonline.entities.Solution;



@Service
public class SolutionServiceImpl extends AbstractCrudService<Solution, Long>
		implements SolutionService {
	@Autowired
	private SolutionDao solutionDao;

	@Autowired
	public SolutionServiceImpl(SolutionDao  crudRepository) {
		super(crudRepository);
		// TODO Auto-generated constructor stub
		solutionDao = crudRepository;
	}


	
	
		



}
