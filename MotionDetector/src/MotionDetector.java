
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Email.Email;
import Sms.Sms;
import Video.Video;

public class MotionDetector {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String first=br.readLine();
		String second=br.readLine();
		
		
		final Sms sms = new Sms();
		final PowerDevice smsAdapter = new SmsAdapter(sms);
		Camera camera = new Camera(smsAdapter);
		camera.click();

		final Email email = new Email();
		final PowerDevice emailAdapter = new EmailAdapter(email);
		camera = new Camera(emailAdapter);
		camera.click();

		final Video video = new Video();
		final PowerDevice videoAdapter = new VideoAdapter(video);
		camera = new Camera(videoAdapter);
		
		camera.click();

	}

}
