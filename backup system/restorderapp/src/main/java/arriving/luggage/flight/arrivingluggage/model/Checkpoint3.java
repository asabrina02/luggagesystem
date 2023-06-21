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
@Table(name= "checkpoint3")
public class Checkpoint3
{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "CheckPoint3Id")
	private int CheckPoint3Id;
	
	@ManyToOne
	@JoinColumn(name="LuggageId")
	private Luggage LuggageId;
	
	
	@JoinColumn(name="LuggageStatus")
	private String LuggageStatus;
	
	@ManyToOne
	@JoinColumn(name="StaffId")
	private Staff StaffId;
	
	@Column(name= "Checkpoint3Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Checkpoint3Date;
	
	@Column(name="Checkpoint3Time")
	private String Checkpoint3Time;
	
	
	public int getCheckPoint3Id() {
		return CheckPoint3Id;
	}

	public void setCheckPoint3Id(int checkPoint3Id) {
		CheckPoint3Id = checkPoint3Id;
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

	public Date getCheckpoint3Date() {
		return Checkpoint3Date;
	}

	public void setCheckpoint3Date(Date checkpoint3Date) {
		Checkpoint3Date = checkpoint3Date;
	}

	public String getCheckpoint3Time() {
		return Checkpoint3Time;
	}

	public void setCheckpoint3Time(String checkpoint3Time) {
		Checkpoint3Time = checkpoint3Time;
	}


	

	
}
