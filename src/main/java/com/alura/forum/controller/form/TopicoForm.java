package com.alura.forum.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.alura.forum.modelo.Curso;
import com.alura.forum.modelo.Topico;
import com.alura.forum.repository.CursoRepository;
import com.sun.istack.NotNull;

public class TopicoForm {

	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	@NotBlank @Length(min = 5)
	private String mensagem;
	@NotBlank @NotEmpty
	private String nomeCurso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico converter(CursoRepository repository) {
		Curso curso = repository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}

}
