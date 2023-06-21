package my.edu.utem.ftmk.dad.project.luggagesystem.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import my.edu.utem.ftmk.dad.project.luggagesystem.model.Passenger;
import my.edu.utem.ftmk.dad.project.luggagesystem.repository.PassengerRepository;

public class PassengerRESTController {

	private PassengerRepository passengerRepository;
	
	//public ResponseEntity<HttpStatus> deletePassenger(long passengerID);
	
	public List<Passenger> getPassenger();
	
	public Passenger getPassenger(long paasengerID);
	
}
