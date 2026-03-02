package atm;

import exceptions.InvalidPinException;

public class Account {
	private int pin;
	
	public Account(int pin) {
		this.pin = pin;
	}
	
	public void checkPin(int pin) throws InvalidPinException {
		if(this.pin != pin)
			throw new InvalidPinException("Invalid Pin");
	}
}
