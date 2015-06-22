package fr.spark.testonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.spark.testonline.entities.Test;
import fr.spark.testonline.services.TestService;

 
@RestController
@RequestMapping("/tests")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Test> getQuestions() {
		return testService.findAll();
	}

}
