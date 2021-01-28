package br.ce.desen.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.ce.desen.domain.Livro;
import br.ce.desen.service.LivroService;


@Component
public class StringToCargoConverter implements Converter<String, Livro> {

	@Autowired
	private LivroService service;
	
	
	@Override
	public Livro convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
