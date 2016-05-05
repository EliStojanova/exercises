
public class StopwatchStates implements Runnable {
	private String state;
	Thread thread = new Thread();
	private int count;
	private boolean flag;

	public StopwatchStates(String state) {
		this.state = state;
		count = 1;
		flag = false;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(count++);
			if (state.equals("start")) {
				thread.start();
				flag = true;
				
			}

			if (state.equals("pause")) {
				try {
					thread.wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				flag = true;
			}
			if (state.equals("resume")) {
				thread.notifyAll();
				flag = true;
			}
			if (state.equals("stop")) {
				thread.interrupt();
				flag = false;
			}
		}

	}

}
