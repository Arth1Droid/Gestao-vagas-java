package br.dev.arthdroid1.gestao_vagas.models;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public class Candidate {
	private UUID id;
	private String name;
	@Pattern(regexp = "\\S+", message = "the username field must not contain spaces")
	private String username;
	@Email(message = "the email field must contain a valid email")
	private String email;
	@Length(min=10, max=100)
	private String password;
	private String description;
	private String curriculum;
	
	public Candidate() {
		
	}

	public Candidate(UUID id, String name, String username, String email, String password, String description,
			String curriculum) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.description = description;
		this.curriculum = curriculum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}

	public UUID getId() {
		return id;
	}
	
	
	
	
	
	

}
