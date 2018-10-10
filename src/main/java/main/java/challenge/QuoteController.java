package main.java.challenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class QuoteController {

	@Autowired
	private QuoteService service;
	
	@GetMapping(value="/quote2")
	public List<Quote> getQuote2() {
		return service.getQuote2();
	}

	@GetMapping(value="/quote")
	public Quote getQuote() {
		return service.getQuote();
	}

	@GetMapping(value="/quote/{actor}")
	public Quote getQuoteByActor(@PathVariable("actor") String actor) {
		return service.getQuoteByActor(actor);
	}

}
