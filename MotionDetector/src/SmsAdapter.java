import Sms.Sms;

public class SmsAdapter implements PowerDevice {

	private Sms sms;

	public SmsAdapter(Sms sms) {
		this.sms = sms;
	}

	@Override
	public void enable() {
		sms.alarmOn();

	}

	@Override
	public void disable() {
		sms.alarmOff();

	}

}
