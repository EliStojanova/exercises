import java.sql.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryMain {
	public static void main(String[] args) throws IOException, SQLException {
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/library", "postgres",
				"Password1");
		System.out.println("Register 1 \n List 2 \n Update 3 \n Unregister 4");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int in = Integer.parseInt(s);
		System.out.println("Vnesi vrednosti za isbn i title");
		String [] tmp=br.readLine().split(" ");
		String isbnIn=tmp[0];
		String titleIn=tmp[1];

		Statement statement = connection.createStatement();

		if (in == 1) {
			statement.executeUpdate("insert into book(isbn,title) values ('" + isbnIn + "','" + titleIn + "')");
		} else if (in == 2) {
			ResultSet resultSet=statement.executeQuery("select * from book");
			while (resultSet.next()) {
				String isbn=resultSet.getString("isbn");
				String title=resultSet.getString("title");
				System.out.println("isbn : " + isbn + " " + "title : " + title );
				
			}
		} else if (in == 3) {
			statement.executeUpdate("update book set isbn='" + isbnIn + "' , title = '" + titleIn + "' where isbn='" + isbnIn + "'");
		} else if (in == 4) {
			statement.executeUpdate("delete from book where isbn='" + isbnIn + "' ");
		} else {
			System.out.println("Pogresen vnes");
		}
	}

}
