package br.ce.hscastro.service;

import java.util.List;

import br.ce.hscastro.domain.Cargo;


public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();	

}
