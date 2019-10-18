package br.com.healthservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prestadores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Providers {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String especialidade; 
	
	private String nome;
	
	private String endereco;
	
	private Double latitude;
	
	private Double longitude;
}
