package digital_wallet;

import digital_wallet.enums.ADD_MONEY;
import digital_wallet.exceptions.InvalidTransactionException;

public interface WalletOperations {
	void addMoney(int pin, double amount, ADD_MONEY m) throws InvalidTransactionException;
	
	void transfer(int pin, double amount) throws InvalidTransactionException;
	
	void transfer(int pin, double amount, String remark);
}
