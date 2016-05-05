import Email.Email;

public class EmailAdapter implements PowerDevice {
	private Email email;

	public EmailAdapter(Email email) {
		this.email = email;
	}

	@Override
	public void enable() {
		email.alarmOn();

	}

	@Override
	public void disable() {
		email.alarmOff();

	}

}
