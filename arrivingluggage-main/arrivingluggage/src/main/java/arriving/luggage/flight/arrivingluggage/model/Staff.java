package arriving.luggage.flight.arrivingluggage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="StaffId")
	private int StaffId;
		
	@Column (name="StaffName")
	private String StaffName;
		
	@Column (name="StaffIc")
	private String StaffIc;
		
	
		public Staff() {
	        // Default constructor logic
	    }
		
	    public Staff(int staffid) {
	        this.StaffId = staffid;
	    }

		public int getStaffId() {
			return StaffId;
		}

		public void setStaffId(int staffId) {
			StaffId = staffId;
		}

		public String getStaffName() {
			return StaffName;
		}

		public void setStaffName(String staffName) {
			StaffName = staffName;
		}

		public String getStaffIc() {
			return StaffIc;
		}

		public void setStaffIc(String staffIc) {
			StaffIc = staffIc;
		}
}
