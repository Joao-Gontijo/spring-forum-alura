package com.alura.forum.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
		
		//Curso é a entidade e Nome é o atributo dentro dela
	Page<Topico> findByCurso_Nome(String nomeCurso, Pageable paginacao);

}
