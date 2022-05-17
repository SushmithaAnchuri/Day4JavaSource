import java.time.LocalDateTime;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResidenceAddress residence=new ResidenceAddress("#127","Dilsuknagar","Hydrebad","Jaya Nilayam","hnk","5-9","jaya");
		OfficeAddress office=new OfficeAddress("#3456","sector1","Hydrebad","jaya nilayam","hnk","2-7");
		
		Employee emp=new Employee(101,"johndoe",LocalDateTime.now(),residence,office,0);
		System.out.println(emp);
	}
	

}
