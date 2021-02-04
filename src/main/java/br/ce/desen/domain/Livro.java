package br.ce.desen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**Projeto Livraria ABC
 * Desenvolvedor: Antonio Halyson - email:halisonsc5@gmail.com
 * Data: 28/01/2021 
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "LIVROS")
public class Livro extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria_fk")
	private Categoria categoria;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
