package br.com.healthservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.healthservices.service.ProvidersLocationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/providers", produces = MediaType.APPLICATION_JSON_VALUE)
public class HealthServicesController {
	
	@Autowired
	private ProvidersLocationService service;
	
	@ApiOperation(value = "Serviço de obtenção de lista de prestadores")
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Retorna a lista de prestadores por especialidade."),
	    @ApiResponse(code = 404, message = "Não foi encontrado prestadores para a especialidade informada."),
	    @ApiResponse(code = 500, message = "Erro Interno"),
	})
	@GetMapping("/obterPrestadoresSaude")
	public final ResponseEntity<Object> get(@RequestParam String especialidade, 
											@RequestParam Double latitude,
											@RequestParam Double longitude) {
			
		return ResponseEntity.ok(service.getHealthProviders(especialidade, latitude, longitude));
	}

}	
