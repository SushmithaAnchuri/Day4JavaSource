
public class OfficeAddress extends Address{
 
	String officeName;
	String landMark;
	String timings;
	public OfficeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OfficeAddress(String doorno, String building, String city, String officeName, String landMark,String timings) {
		super(doorno, building, city);
		this.officeName=officeName;
		this.landMark=landMark;
		this.timings=timings;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "OfficeAddress [officeName=" + officeName + ", landMark=" + landMark + ", timings=" + timings
				+ ", doorno=" + doorno + ", building=" + building + ", city=" + city + "]";
	}
	
	

	
}
