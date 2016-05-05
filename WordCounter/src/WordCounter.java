import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;

public class WordCounter {
	public static void main(String[] args) throws IOException {
		BufferedReader brWordForCheck=new BufferedReader(new InputStreamReader(System.in));
		String wordForCheck = brWordForCheck.readLine();
		
		try {
            FileReader file = new FileReader("SourceReader.java");
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                if (line == null) {
                    eof = true;

                } else {
                    System.out.println(line);
                }
            }
            buff.close();

        } catch (IOException e) {
            System.out.println("Error — " + e.toString());

        }
	}

	
}
