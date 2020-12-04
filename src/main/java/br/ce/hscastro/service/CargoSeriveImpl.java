package br.ce.hscastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ce.hscastro.dao.CargoDao;
import br.ce.hscastro.domain.Cargo;

@Service  @Transactional(readOnly = false)
public class CargoSeriveImpl implements CargoService {
	
	@SuppressWarnings("unused")
	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(Cargo cargo) {
		
		dao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		
		dao.update(cargo);
	}

	@Override
	public void excluir(Long id) {
		
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Cargo buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		
		return dao.findAll();
	}

}