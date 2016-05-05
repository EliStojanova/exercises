import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

public class TimePeriodOverlapTest {
	private TimePeriod timePeriod;
	
	@Before
	public void setUp(){
		timePeriod=new TimePeriod();
	}
	
	@Test
	public void testExample(){
		timePeriod.checkTime(LocalTime.of(10, 10), LocalTime.of(13, 10), LocalTime.of(12, 10), LocalTime.of(14, 10));
	}
	
	
	
}
