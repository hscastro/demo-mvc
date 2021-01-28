package br.ce.desen.service;

import java.util.List;

import br.ce.desen.domain.Livro;


public interface LivroService {

	void salvar(Livro livro);
	
	void editar(Livro livro);
	
	void excluir(Long id);
	
	Livro buscarPorId(Long id);
	
	List<Livro> buscarTodos();

	//boolean cargoTemFuncionario(Long id);

}
