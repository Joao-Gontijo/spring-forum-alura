package com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDto;
import com.alura.forum.modelo.Curso;
import com.alura.forum.modelo.Topico;


@RestController //inibe a necessidade do ResponseBody
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Duvida", "Id nulo", 
				new Curso("Spring", "Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
}
