package arriving.luggage.flight.arrivingluggage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

import arriving.luggage.flight.arrivingluggage.repository.Checkpoint1Repository;
import arriving.luggage.flight.arrivingluggage.model.Checkpoint1;


@RestController
@RequestMapping("/api/checkpoint1s")
public class Checkpoint1RESTController {
	
	@Autowired
	private Checkpoint1Repository checkpoint1Repository;
	
	@GetMapping
	public List<Checkpoint1> getCheckpoint1(){
		return checkpoint1Repository.findAll();
		
	}
	
	@GetMapping("{Checkpoint1Id}")
	public Checkpoint1 getCheckpoint1(@PathVariable long Checkpoint1Id)
	{
		Checkpoint1 checkpoint1 = checkpoint1Repository.findById(Checkpoint1Id).get();
		return checkpoint1;
		
	}
	
	@PostMapping()
	public Checkpoint1 insertCheckpoint1 (@RequestBody Checkpoint1 checkpoint1)
	{		
		return checkpoint1Repository.save(checkpoint1);
	}
	
	@PutMapping()
	public Checkpoint1 updateCheckpoint1(@RequestBody Checkpoint1 checkpoint1)
	{
		return checkpoint1Repository.save(checkpoint1);
	}
	
	@DeleteMapping("{Checkpoint1Id}")
	public ResponseEntity<HttpStatus> deleteCheckpoint1(@PathVariable long Checkpoint1Id)
	{
		checkpoint1Repository.deleteById(Checkpoint1Id);
		return new ResponseEntity<>(HttpStatus.OK);
	}	
}
