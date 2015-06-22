package fr.spark.testonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.spark.testonline.entities.Administration;

import fr.spark.testonline.services.AdministrationService;



@RestController
@RequestMapping("/candidats")
public class AdministrationController {

	@Autowired
	private AdministrationService administrationService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Administration> getAdministrations() {
		return administrationService.findAll();
		
	}

}
