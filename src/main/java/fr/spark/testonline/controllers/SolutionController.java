package fr.spark.testonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import fr.spark.testonline.entities.Solution;

import fr.spark.testonline.services.SolutionService;

@RestController
@RequestMapping("/solutions")
public class SolutionController {

	@Autowired
	private SolutionService solutionService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Solution> getQuestions() {
		return solutionService.findAll();
	}

}
