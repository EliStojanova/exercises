import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberPrinter {


		public static void main(String[] args) throws Exception {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s=br.readLine();
			int time;
			time=Integer.parseInt(br.readLine());
			
			final Task task = new Task(Integer.parseInt(s));
			final Thread taskThread = new Thread(task);
			taskThread.start();
			
			System.out.println("Waithing on task to finish...");
			taskThread.join(time);
			System.out.println("Task finished or timeout exeeded.");
		}
		
		public static class Task implements Runnable {
			int tmp;
			public Task(int tmp){
				this.tmp=tmp;
			}
			@Override
			public void run() {
				for(int i=1;i<tmp;i++){
					if(Thread.interrupted()){
						return;
					}
					else System.out.println(i);
				}
			}
			
		}

	
	
}
