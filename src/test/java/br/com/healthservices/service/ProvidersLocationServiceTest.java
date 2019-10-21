//package br.com.healthservices.service;
//
//import static org.junit.Assert.fail;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.json.JSONObject;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import br.com.healthservices.dto.ElementsDTO;
//import br.com.healthservices.dto.RouteResponseDTO;
//import br.com.healthservices.dto.RowsDTO;
//import br.com.healthservices.model.Providers;
//import br.com.healthservices.repository.ProvidersRepository;
//import reactor.core.publisher.Mono;
//
//@RunWith(SpringRunner.class)
//public class ProvidersLocationServiceTest {
//
//	@InjectMocks
//	ProvidersLocationService service;
//	
//	@Mock
//	ProvidersRepository repository;
//	
//	@Mock
//	WebClient web;
//	
//	@Before
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//	}
//	
//	@Test
//	public void getHealthProvidersTest() {
//		
//		try {
//			when(repository.findByEspecialidade(Mockito.anyString())).thenReturn(reponseFindBySpeciality());
//			when(WebClient.create()).then(Mono<>);
//			service.getHealthProviders("ODONTOLOGIA", -23.57266320, -46.643659);
//		} catch (Exception e) {
//			fail();
//		}
//	}
//	
//	private Mono<RouteResponseDTO> res(){
//		RouteResponseDTO route = new RouteResponseDTO();
//		JSONObject js = new JSONObject();
//		js.getJSONArray("").get(
//		ElementsDTO elç
//		route.setRows(new RowsDTO(new Ele));
//		Mono.create(sub ->{
//			sub.success(value);
//		})
//		return null;
//		
//	}
//	private List<Providers> reponseFindBySpeciality(){
//		List<Providers> providers = new ArrayList<>();
//		
//		providers.add(new Providers(1, "ODONTOLOGIA", "ODONTOCLINIC", "RUA 01 LT 3", -13.57266320, -33.57266320));
//		
//		return providers;
//	}
//}
