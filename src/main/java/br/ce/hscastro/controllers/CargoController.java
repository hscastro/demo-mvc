package br.ce.hscastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.ce.hscastro.domain.Cargo;
import br.ce.hscastro.domain.Departamento;
import br.ce.hscastro.service.CargoService;
import br.ce.hscastro.service.DepartamentoService;

@Controller
@RequestMapping("/cargos")
public class CargoController {
	
	@Autowired
	private CargoService service;
	
	@Autowired
	private DepartamentoService departamentoService; 

	
	@GetMapping("/cadastrar")
	public String cadastrar(Cargo cargo) {
		return "/cargo/cadastro";
	}
	
	@PostMapping("/salvar")
	public String salvar(Cargo cargo, RedirectAttributes attr) {
		service.salvar(cargo);
		attr.addFlashAttribute("success", "Cargo inserido com sucesso.");
		return "redirect:/cargos/cadastrar";
	}
	
	
	@GetMapping("/listar")
	public String listar() {
		return "/cargo/lista";
	}	
	
	@ModelAttribute("departamentos")
	public List<Departamento> listaDeDepartamentos() {
		return departamentoService.buscarTodos();		
	}	
	
	
}
