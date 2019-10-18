package br.com.healthservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.healthservices.model.Providers;

@Repository
public interface ProvidersRepository extends JpaRepository<Providers, Integer>{
	
	public List<Providers> findByEspecialidade(String esp);

}
