package br.ce.hscastro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ce.hscastro.domain.Departamento;
import br.ce.hscastro.service.DepartamentoService;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

	@Autowired
	private DepartamentoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/departamentos/cadastrar";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/departamentos/lista";
	}
	
	@GetMapping("/salvar")
	public String salvar(Departamento departamento) {
		service.salvar(departamento);
		return "redirect:/departamentos/cadastrar";
	}	
	
}
