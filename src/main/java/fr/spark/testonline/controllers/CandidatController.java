package fr.spark.testonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import fr.spark.testonline.entities.Candidat;

import fr.spark.testonline.services.CandidatService;

@RestController
@RequestMapping("/candidats")
public class CandidatController {

	@Autowired
	private CandidatService candidatService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Candidat> getCandidats() {
		return candidatService.findAll();
	}

}
