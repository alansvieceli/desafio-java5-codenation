package main.java.challenge;

import java.util.List;

public interface QuoteService {

	Quote getQuote();
	
	Quote getQuoteByActor(String actor);
	
	List<Quote> getQuote2();

}
