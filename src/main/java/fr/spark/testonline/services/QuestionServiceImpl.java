package fr.spark.testonline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.spark.testonline.dao.QuestionDao;

import fr.spark.testonline.entities.Question;

@Service
public class QuestionServiceImpl extends AbstractCrudService<Question, Long>
		implements QuestionService {
	@Autowired
	private QuestionDao questionDao;

	@Autowired
	public QuestionServiceImpl(QuestionDao crudRepository) {
		super(crudRepository);
		questionDao = crudRepository;
	}

}
