package my.edu.utem.ftmk.dad.project.luggagesystem.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FlightId")
	private String FlightID;
	
	@Column(name = "FlightName")
	private String FlightName;
	
	@Column(name = "ArrivalTime")
	private String arrivalTime;
	
	private Airport departingAirport;
	
	private Airport arrivingAirport;
	
	private List<Passenger> passenger;
	
	private int flightNumber;

	public String getFlightID() {
		return FlightID;
	}

	public void setFlightID(String flightID) {
		FlightID = flightID;
	}

	public String getFlightName() {
		return FlightName;
	}

	public void setFlightName(String flightName) {
		FlightName = flightName;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Airport getDepartingAirport() {
		return departingAirport;
	}

	public void setDepartingAirport(Airport departingAirport) {
		this.departingAirport = departingAirport;
	}

	public Airport getArrivingAirport() {
		return arrivingAirport;
	}

	public void setArrivingAirport(Airport arrivingAirport) {
		this.arrivingAirport = arrivingAirport;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	
}
