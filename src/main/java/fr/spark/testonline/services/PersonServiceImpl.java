package fr.spark.testonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.spark.testonline.dao.PersonDao;
import fr.spark.testonline.entities.Person;

@Service
public class PersonServiceImpl extends AbstractCrudService<Person, Long>
		implements PersonService {
	@Autowired
	private PersonDao personDao;

	@Autowired
	public PersonServiceImpl(PersonDao crudRepository) {
		super(crudRepository);
		personDao = crudRepository;
	}

}
