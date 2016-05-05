import java.time.LocalTime;

public class TimePeriod {
	
	private LocalTime startDate;
	private LocalTime endDate;
	
	public TimePeriod() {
		this.startDate=startDate;
		this.endDate = endDate;
	}
	
	public boolean checkTime(LocalTime startDate1, LocalTime endDate1,LocalTime startDate2, LocalTime endDate2){
		if(startDate1.isBefore(endDate2) && endDate1.isAfter(startDate2)){
			return true;
		}
		
		else return false;
	}
	
	
	
	
}
