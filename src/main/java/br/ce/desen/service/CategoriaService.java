package br.ce.desen.service;

import java.util.List;

import br.ce.desen.domain.Categoria;

public interface CategoriaService {
	
	void salvar(Categoria livro);
	
	void editar(Categoria livro);
	
	void excluir(Long id);
	
	Categoria buscarPorId(Long id);
	
	List<Categoria> buscarTodos();

	boolean departamentoTemCargo(Long id);

}
