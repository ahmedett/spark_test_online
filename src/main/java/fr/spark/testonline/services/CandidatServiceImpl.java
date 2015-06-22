package fr.spark.testonline.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import fr.spark.testonline.dao.CandidatDao;

import fr.spark.testonline.entities.Candidat;


@Service
public class CandidatServiceImpl extends AbstractCrudService<Candidat, Long>
		implements CandidatService {
	@Autowired
	private CandidatDao candidatDao;

	@Autowired
	public CandidatServiceImpl(CandidatDao  crudRepository) {
		super(crudRepository);
		// TODO Auto-generated constructor stub
		candidatDao = crudRepository;
	}


	
	
		



}
