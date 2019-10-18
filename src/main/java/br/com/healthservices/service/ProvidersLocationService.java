package br.com.healthservices.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.healthservices.dto.ProvidersDTO;
import br.com.healthservices.dto.RouteResponseDTO;
import br.com.healthservices.model.Providers;
import br.com.healthservices.repository.ProvidersRepository;

@Service
public class ProvidersLocationService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	ProvidersRepository repository;

	public List<ProvidersDTO> obterPrestadoresSaude(String esp, Double latitude, Double longitude){

		List<Providers> providersEnt = repository.findByEspecialidade(esp);

		List<ProvidersDTO> provDto = providersEnt.stream().map(prov -> {
			RouteResponseDTO reponseRoutes = routes(latitude+","+longitude, prov.getLatitude()+","+prov.getLongitude());

			return convertToDto(prov, reponseRoutes.getRows().get(0).getElements().get(0).getDistance().getValue() / 1000);
		}).collect(Collectors.toList());

		return provDto;
	}

	public RouteResponseDTO routes(String origins, String destinations) {

		RouteResponseDTO response =  WebClient
				.create("https://maps.googleapis.com")
				.get()
				.uri(uriBuilder -> uriBuilder
						.path("/maps/api/distancematrix/json")
						.queryParam("units", "metrics")
						.queryParam("origins", origins)
						.queryParam("destinations", destinations)
						.queryParam("key", "AIzaSyDNwb4fI9WcY2Qxou_w7GK5anlzb78Ilyo")
						.build())
				.retrieve()
				.bodyToMono(RouteResponseDTO.class)
				.block();	

		return response;
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	private ProvidersDTO convertToDto(Providers providers, Double distance) {
		ProvidersDTO provDto = modelMapper.map(providers, ProvidersDTO.class);
		provDto.setDistanciaEmKm(distance);

		return provDto;
	}


}
