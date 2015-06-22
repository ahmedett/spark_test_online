package fr.spark.testonline.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidat")
public class Candidat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	private String email;
	private int motdepasse;
	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Candidat() {
	}

	@Override
	public String toString() {
		return "Candidat [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", email=" + email + ", motdepasse=" + motdepasse + ", age="
				+ age + "]";
	}

	
}
