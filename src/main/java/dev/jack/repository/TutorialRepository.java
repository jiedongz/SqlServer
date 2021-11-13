package dev.jack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.jack.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	// The implementation is plugged in by Spring Data JPA automatically.
	// Now we can use JpaRepository’s methods: save(), findOne(), findById(), findAll(), 
	// count(), delete(), deleteById()… without implementing these methods.
	
	// how to write a custom methods with spring-data-jpa
	// https://www.netsurfingzone.com/jpa/how-to-write-custom-method-in-repository-in-spring-data-jpa/
	//
	// returns all Tutorials with published having value as input published.
	List<Tutorial> findByPublished(boolean published);	
	
	// returns all Tutorials which title contains input title.
	List<Tutorial> findByTitleContaining(String title);
	
	// 
	List<Tutorial> findByTitleContainingAndPublished(String title, boolean published);
}
