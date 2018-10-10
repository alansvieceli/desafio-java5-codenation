package main.java.challenge;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends  JpaRepository<Quote, Integer> {
	
	List<Quote> findByActorNotNull();
	
    List<Quote> findByActor(String text);

}
