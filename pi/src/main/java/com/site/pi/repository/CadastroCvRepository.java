package com.site.pi.repository;

import java.util.List;

import com.site.pi.models.CadastroCv;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface CadastroCvRepository extends CrudRepository <CadastroCv, String>{

    CadastroCv findById(long id);

	List<CadastroCv> findByNome(String nome);

	// Query para a busca
	@Query(value = "select u from CadastroCv u where u.nome like %?1%")
	List<CadastroCv> findByNomesCadastroCvs(String nome);
    
}
