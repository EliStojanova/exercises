

public class Camera {
	private boolean enabled = false;

	private PowerDevice device;

	public Camera(PowerDevice device) {
		this.device = device;
	}

	public void click() {

		enabled = !enabled;

		if (enabled) {
			device.enable();
		} else {
			device.disable();
		}
	}
}
