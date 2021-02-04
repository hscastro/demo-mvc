package br.ce.desen.dao;

import java.util.List;

import br.ce.desen.domain.Livro;


public interface LivroDao {
	
	void save(Livro livro);
	
	void update(Livro livro);
	
	void delete(Long id);
	
	Livro findById(Long id);
	
	List<Livro> findAll();

}
