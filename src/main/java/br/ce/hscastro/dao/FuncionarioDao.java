package br.ce.hscastro.dao;

import java.util.List;
import br.ce.hscastro.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

	List<Funcionario> findByName(String nome);

	List<Funcionario> findByCargo(Long id);
	
}
