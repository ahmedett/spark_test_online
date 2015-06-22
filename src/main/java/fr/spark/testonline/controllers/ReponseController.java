package fr.spark.testonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import fr.spark.testonline.entities.Reponse;
import fr.spark.testonline.services.ReponseService;

@RestController
@RequestMapping("/reponses")
public class ReponseController {

	@Autowired
	private ReponseService reponseService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Reponse> getReponses() {
		return reponseService.findAll();
	}

}
