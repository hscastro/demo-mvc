package br.ce.desen.dao;

import java.util.List;

import br.ce.desen.domain.Categoria;

public interface CategoriaDao {
	
	void save(Categoria livro);
	
	void update(Categoria livro);
	
	void delete(Long id);
	
	Categoria findById(Long id);
	
	List<Categoria> findAll();

}
