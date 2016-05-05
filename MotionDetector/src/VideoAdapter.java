import Video.Video;

public class VideoAdapter implements PowerDevice {
	private Video video;

	public VideoAdapter(Video video) {
		this.video = video;
	}

	@Override
	public void enable() {
		video.alarmOn();

	}

	@Override
	public void disable() {
		video.alarmOff();

	}

}
