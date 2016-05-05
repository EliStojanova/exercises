import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stopwatch {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		StopwatchStates stopwatchStates = new StopwatchStates(s);

		stopwatchStates.run();

	}
}
