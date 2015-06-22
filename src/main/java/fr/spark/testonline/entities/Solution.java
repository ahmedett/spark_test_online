package fr.spark.testonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Solution {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	 
	
	
	public Solution() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Solution [id=" + id + "]";
	}
	
}