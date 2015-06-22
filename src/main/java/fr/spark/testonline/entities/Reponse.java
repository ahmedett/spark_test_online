package fr.spark.testonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reponse")
public class Reponse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	
	
	public Reponse() {
	
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Reponse [id=" + id + "]";
	}
	
}