public class DateParser {
	public static void main(String[] args) {
		String birthday = "10/10/2010";
		String day = "";
		String month = "";
		String year = "";
		String[] birthdaySplit = birthday.split("/");
		for (int i = 0; i < birthday.length(); i++) {
			day = birthdaySplit[0];
			month = birthdaySplit[1];
			year = birthdaySplit[2];
		}

		System.out.println("Day:" + day);
		System.out.println("Month:" + month);
		System.out.println("Year:" + year);
	}
}
