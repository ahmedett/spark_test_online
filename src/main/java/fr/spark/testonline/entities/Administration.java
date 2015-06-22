package fr.spark.testonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administration")
public class Administration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private int motdepasse;
	public Administration() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(int motdepasse) {
		this.motdepasse = motdepasse;
	}
	@Override
	public String toString() {
		return "Administration [id=" + id + ", email=" + email
				+ ", motdepasse=" + motdepasse + "]";
	}
	
}