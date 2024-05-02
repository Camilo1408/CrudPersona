package xyz.cesarh.persona.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.cesarh.persona.persona.model.Estado;
import xyz.cesarh.persona.persona.service.EstadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/estado/")
public class EstadoRest {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable("id") Long PaisId){
		return ResponseEntity.ok(estadoService.findAllByCountry(PaisId));
	}
	
}
