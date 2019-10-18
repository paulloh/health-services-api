package br.com.healthservices.dto;

import lombok.Data;

@Data
public class ProvidersDTO implements Comparable<ProvidersDTO>{
	
	private String nome;
	
	private String endereco;
	
	private Double latitude;
	
	private Double longitude;
	
	private Double distanciaEmKm;

	@Override
	public int compareTo(ProvidersDTO o) {
		return getDistanciaEmKm().compareTo(o.getDistanciaEmKm());
	}
	
}
