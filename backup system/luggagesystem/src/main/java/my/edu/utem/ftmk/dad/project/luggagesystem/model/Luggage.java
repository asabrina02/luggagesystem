package my.edu.utem.ftmk.dad.project.luggagesystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "luggage")
public class Luggage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name = "LuggageID")
	private String luggageID;
	
	@Column(name = "LuggageStatus")
	private String luggageStatus;
	
	private String staffID;
	
	private String nameStaff;
	
	private Flight flight;
	
	public String getLuggageID() {
		return luggageID;
	}

	public void setLuggageID(String luggageID) {
		this.luggageID = luggageID;
	}

	public String getLuggageStatus() {
		return luggageStatus;
	}

	public void setLuggageStatus(String luggageStatus) {
		this.luggageStatus = luggageStatus;
	}
	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getNameStaff() {
		return nameStaff;
	}

	public void setNameStaff(String nameStaff) {
		this.nameStaff = nameStaff;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	

}
