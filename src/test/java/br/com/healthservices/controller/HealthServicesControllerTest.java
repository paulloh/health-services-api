package br.com.healthservices.controller;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.apache.catalina.filters.CorsFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.healthservices.dto.ProvidersDTO;
import br.com.healthservices.service.ProvidersLocationService;

//@RunWith(SpringRunner.class)
public class HealthServicesControllerTest {

	@InjectMocks
	HealthServicesController controller;
	
	MockMvc mockMvc;
	
	@Mock
	ProvidersLocationService service;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).addFilter(new CorsFilter()).build();
	}
	
//	@Test
	public void testSuccessCall() {
		try {
//			when(service.obterPrestadoresSaude(Matchers.anyString(), Matchers.anyString(), Matchers.anyString())
			 this.mockMvc.perform(MockMvcRequestBuilders.get("/providers/obterPrestadoresSaude")
			            .contentType(MediaType.APPLICATION_JSON)
			            .param("especialidade", "MEDICINE")
			            .param("latitude", "-23.57266320")
			            .param("longitude", "-46.643659")
			            .accept(MediaType.APPLICATION_JSON)
			            .content(asJsonString(getResponse())))
			 			.andDo(MockMvcResultHandlers.print())
			            .andExpect(MockMvcResultMatchers.status().isOk());
		}catch(Exception e) {
			fail();
		}
		
	}
	
	private ProvidersDTO getResponse() {
		ProvidersDTO dto = new ProvidersDTO();
		
		dto.setDistanciaEmKm(12.2);
		dto.setEndereco("blablal");
		return dto;
	}
	
	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
}
