package fr.spark.testonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.spark.testonline.dao.AdministrationDao;

import fr.spark.testonline.entities.Administration;



@Service
public class AdministrationServiceImpl extends AbstractCrudService<Administration, Long>
		implements AdministrationService {
	@Autowired
	private AdministrationDao administrationDao;

	@Autowired
	public AdministrationServiceImpl(AdministrationDao  crudRepository) {
		super(crudRepository);
		// TODO Auto-generated constructor stub
		administrationDao = crudRepository;
	}


	
	
		



}
