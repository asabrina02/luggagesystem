package arriving.luggage.flight.arrivingluggage.model;

import java.sql.Date;


import org.springframework.format.annotation.DateTimeFormat;

//import arriving.luggage.flight.arrivingluggage.model.Truck;
import jakarta.persistence.GenerationType;
//import arriving.luggage.flight.arrivingluggage.model.Luggage;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name= "checkpoint4")
public class Checkpoint4
{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "CheckPoint4Id")
	private int CheckPoint4Id;
	
	@ManyToOne
	@JoinColumn(name="LuggageId")
	private Luggage LuggageId;
	
	
	@JoinColumn(name="LuggageStatus")
	private String LuggageStatus;
	
	@ManyToOne
	@JoinColumn(name="StaffId")
	private Staff StaffId;
	
	@Column(name= "Checkpoint4Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Checkpoint4Date;
	
	@Column(name="Checkpoint4Time")
	private String Checkpoint4Time;
	
	
	public int getCheckPoint4Id() {
		return CheckPoint4Id;
	}

	public void setCheckPoint4Id(int checkPoint4Id) {
		CheckPoint4Id = checkPoint4Id;
	}

	public Luggage getLuggageId() {
		return LuggageId;
	}

	public void setLuggageId(Luggage luggageId) {
		LuggageId = luggageId;
	}

	public String getLuggageStatus() {
		return LuggageStatus;
	}

	public void setLuggageStatus(String luggageStatus) {
		LuggageStatus = luggageStatus;
	}

	public Staff getStaffId() {
		return StaffId;
	}

	public void setStaffId(Staff staffId) {
		StaffId = staffId;
	}

	public Date getCheckpoint4Date() {
		return Checkpoint4Date;
	}

	public void setCheckpoint4Date(Date checkpoint4Date) {
		Checkpoint4Date = checkpoint4Date;
	}

	public String getCheckpoint4Time() {
		return Checkpoint4Time;
	}

	public void setCheckpoint4Time(String checkpoint4Time) {
		Checkpoint4Time = checkpoint4Time;
	}


	

	
}
