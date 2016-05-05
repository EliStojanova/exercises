
public class NumberPrinting  implements Runnable {

		private int number;
		private int timeInterval;
		
		
		public int getTimeInterval() {
			return timeInterval;
		}



		public void setTimeInterval(int timeInterval) {
			this.timeInterval = timeInterval;
		}



		public int getNumber() {
			return number;
		}



		public void setNumber(int number) {
			this.number = number;
		}



		@Override
		public void run() {
			for (int i = 1; i < number; i++) {
				try {
					Thread.sleep(timeInterval);
				} catch (InterruptedException e) {
				}System.out.println(i);
			
			}
		}
		
	
}
