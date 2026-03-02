package encapsulation;

public class Hulku {
	public static void main(String[] args) {
		short pin = 6598;
		
		HulkuKaAccount hulkuKaAccount = new HulkuKaAccount();
		
		System.out.println(hulkuKaAccount.getBalance(pin));
	}
}
