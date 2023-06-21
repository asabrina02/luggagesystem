package my.edu.utem.ftmk.dad.project.luggagesystem.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "passenger")


public class Passenger {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PassengerId")
	private String passengerID;
	
	@Column(name = "PassengerName")
	private String name;
	
	private List<Luggage> luggage;
	
	private Flight flight;
	
	public String getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Luggage> getLuggage() {
		return luggage;
	}

	public void setLuggage(List<Luggage> luggage) {
		this.luggage = luggage;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	
}
