import java.time.LocalDateTime;
public class Employee {

	int empId;
	String fullName;
	LocalDateTime dateOfJoining;
	ResidenceAddress residence;
	OfficeAddress office;
	static int managerId;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(int empId, String fullName, LocalDateTime dateOfJoining, ResidenceAddress residence,
			OfficeAddress office,int managerId) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.residence = residence;
		this.office = office;
		Employee.managerId=managerId;
	}



	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public ResidenceAddress getResidence() {
		return residence;
	}
	public void setResidence(ResidenceAddress residence) {
		this.residence = residence;
	}
	public OfficeAddress getOffice() {
		return office;
	}
	public  void setOffic(OfficeAddress office) {
		this.office = office;
	}
	public static int getManagerId() {
		return managerId;
	}
	public static void setManagerId(int managerId) {
		Employee.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining
				+ ", residence=" + residence + ", officeAddress=" + office + "]";
	}
	
}
