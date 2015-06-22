package fr.spark.testonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.spark.testonline.dao.TestDao;
import fr.spark.testonline.entities.Test;



@Service
public class TestServiceImpl extends AbstractCrudService<Test, Long>
		implements  TestService {
	@Autowired
	private TestDao testDao;

	@Autowired
	public TestServiceImpl(TestDao crudRepository) {
		super(crudRepository);
		testDao = crudRepository;
	}

}
