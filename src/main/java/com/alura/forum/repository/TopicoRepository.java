package com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
