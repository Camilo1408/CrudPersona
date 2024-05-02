package xyz.cesarh.persona.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.cesarh.persona.persona.model.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Long> {

	
}
