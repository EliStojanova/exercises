
public class InvestmentCalculator {
	
	public static void main(String [] args){
		long investment=14000;
		System.out.println("First year:" + (investment + (investment*0.4)));
		System.out.println("Second year:" + (investment - (investment-1500)));
		System.out.println("Third year:" + (investment + investment*0.13));
	}
}
