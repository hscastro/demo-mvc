package br.ce.desen.dao;


import org.springframework.stereotype.Repository;

import br.ce.desen.domain.Livro;

@Repository
public class CargoDaoImpl extends AbstractDao<Livro, Long> implements LivroDao {

}
