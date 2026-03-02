package encapsulation;

public class Chomu {
	public static void main(String[] args) {
		short pin = 1234;
		
		HulkuKaAccount hulkuKaAccount = new HulkuKaAccount();
		
		System.out.println(hulkuKaAccount.getBalance(pin));
	}
}
