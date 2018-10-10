package main.java.challenge;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;
	
	private String decodeParam(String text) {
		try {
			
			return URLDecoder.decode(text, "UTF-8");

		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

	@Override
	public Quote getQuote() {
		List<Quote> lista = repository.findByActorNotNull();
		if (lista.size() > 0) {
			Collections.shuffle(lista);
			return lista.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		actor = decodeParam(actor);
		List<Quote> lista = repository.findByActor(actor);
		if (lista.size() > 0) {
			Collections.shuffle(lista);
			return lista.get(0);
		} else {
			return null;
		}

	}

	@Override
	public List<Quote> getQuote2() {
		return repository.findByActorNotNull();
	}

}
