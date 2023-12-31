package model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

//Aqui estamos criando uma classe abstrata
@MappedSuperclass //faz com que feature e new extendão dessa classe
public abstract class BaseItem {
	
	@Id	// Ele serve para dizer que é o identificador |Precisou fazer o import 
	@GeneratedValue(strategy =  GenerationType.IDENTITY) //"Dizer que é gerado automaticamente" as 10:04 como estrategia
	private Long id;
	
	private String icon;
	
	private String description;
	
	//Encapsulamento
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
