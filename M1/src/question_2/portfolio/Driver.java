package question_2.portfolio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum InvestmentType {
	Equity, Debt
}


// Exceptions
class InvalidInvestmentException extends Exception {
	public InvalidInvestmentException(String message) {
		super(message);
	}
}

class InvestmentRejectedException extends RuntimeException {
	public InvestmentRejectedException(String message) {
		super(message);
	}
}

// interfaces

interface InvestmentTransactionOperations {
	public void authorize();
	public void authorize(String securityCode);
	public InvestmentTransaction applyTax() throws InvalidInvestmentException;
}

// Comparator

class InvestmentAmountComparator implements Comparator<InvestmentTransaction> {

	@Override
	public int compare(InvestmentTransaction a, InvestmentTransaction b) {
		if(a.getInvestedAmount() > b.getInvestedAmount())
			return 1;
		else if(a.getInvestedAmount() < b.getInvestedAmount())
			return -1;
		return 0;
	}
	
}

// Abstract class

abstract class InvestmentTransaction implements InvestmentTransactionOperations/*, Comparable<InvestmentTransaction>*/ {
	private final String transactionId;
	private final String investorName;
	private final double investedAmount;
	private final InvestmentType investmentType;
	private final double tax;
	
	public InvestmentTransaction(String transactionId, String investorName, double investedAmount, InvestmentType investmentType, double tax) throws InvalidInvestmentException {
		if(investedAmount <= 0) {
			throw new InvalidInvestmentException("Invesment Amount must be greater than 0");
		}
		if(!(tax >= 0 && tax <= 30)) {
			throw new InvalidInvestmentException("Tax must be between 0 and 30");
		}
		
		this.transactionId = transactionId;
		this.investorName = investorName;
		this.investedAmount = investedAmount;
		this.investmentType = investmentType;
		this.tax = tax;
	}
	
	public String getTransactionId() {
		return this.transactionId;
	}
	
	public String getInvestorName() {
		return this.investorName;
	}
	
	public double getInvestedAmount() {
		return this.investedAmount;
	}
	
	public InvestmentType getInvestmentType() {
		return this.investmentType;
	}
	
	public double getTax() {
		return this.tax;
	}
	
//	public int compareTo(InvestmentTransaction that) {
//		if(this.investedAmount > that.investedAmount)
//			return 1;
//		else if(this.investedAmount < that.investedAmount)
//			return -1;
//		return 0;
//	}
}


// Child classes

class EquityInvestment extends InvestmentTransaction {
	public EquityInvestment(String transactionId, String investorName, double investedAmount, double tax) throws InvalidInvestmentException {
		super(transactionId, investorName, investedAmount, InvestmentType.Equity, tax);
	}

	@Override
	public void authorize() {
		
	}

	@Override
	public void authorize(String securityCode) {
		if(securityCode == null || !securityCode.equals("code")) {
			throw new InvestmentRejectedException("Invalid security code");
		}
	}

	@Override
	public InvestmentTransaction applyTax() throws InvalidInvestmentException {
		double taxAmount = (this.getInvestedAmount() * this.getTax()) / 100.0;
		
		double netAmount = this.getInvestedAmount() - taxAmount;
		
		return new EquityInvestment(
				this.getTransactionId(),
				this.getInvestorName(),
				netAmount,
				getTax()
		);
	}
}


class DebtInvestment extends InvestmentTransaction {
	public DebtInvestment(String transactionId, String investorName, double investedAmount, double tax) throws InvalidInvestmentException {
		super(transactionId, investorName, investedAmount, InvestmentType.Debt, tax);
	}
	
	private void isInvestmentValid() {
		if(this.getInvestedAmount() > 50000) {
			throw new InvestmentRejectedException("Investment Amount for Debt cannot be more than Rs. 50,000");
		}
	}

	@Override
	public void authorize() {
		isInvestmentValid();
	}

	@Override
	public void authorize(String securityCode) {
		isInvestmentValid();
		if(securityCode == null || !securityCode.equals("code")) {
			throw new InvestmentRejectedException("Invalid security code");
		}
	}

	@Override
	public InvestmentTransaction applyTax() throws InvalidInvestmentException {
		double taxAmount = (this.getInvestedAmount() * this.getTax()) / 100.0;
		
		double extra = this.getInvestedAmount() * 0.02;
		
		double netAmount = this.getInvestedAmount() - taxAmount + extra;
		
		return new DebtInvestment(
				this.getTransactionId(),
				this.getInvestorName(),
				netAmount,
				getTax()
		);
	}
}

// Driver

public class Driver {
	public static void main(String[] args) {

        try {
            // 1️⃣ Create investments
            InvestmentTransaction equity =
                    new EquityInvestment("TXN101", "Akshat", 100000, 10);

            InvestmentTransaction debt =
                    new DebtInvestment("TXN102", "Rahul", 40000, 8);

            // 2️⃣ Authorization
            equity.authorize("code");
            debt.authorize("code");

            // 3️⃣ Apply tax (IMMUTABLE TRANSFORMATION)
            InvestmentTransaction equityAfterTax =
                    equity.applyTax();

            InvestmentTransaction debtAfterTax =
                    debt.applyTax();

            // 4️⃣ Display results
            System.out.println("Original Equity Amount: " + equity.getInvestedAmount());
            System.out.println("Equity After Tax: " + equityAfterTax.getInvestedAmount());

            System.out.println("Original Debt Amount: " + debt.getInvestedAmount());
            System.out.println("Debt After Tax: " + debtAfterTax.getInvestedAmount());

            // 5️⃣ Store in collection
            List<InvestmentTransaction> portfolio = new ArrayList<>();
            portfolio.add(equity);
            portfolio.add(debt);
            portfolio.add(equityAfterTax);
            portfolio.add(debtAfterTax);

            // 6️⃣ Sort using Comparable
//            Collections.sort(portfolio, new InvestmentAmountComparator());
            
            Collections.sort(portfolio, (a, b) -> {
	            	if(a.getInvestedAmount() > b.getInvestedAmount())
	        			return 1;
	        		else if(a.getInvestedAmount() < b.getInvestedAmount())
	        			return -1;
	        		return 0;
            });

            System.out.println("\n--- Portfolio Sorted by Invested Amount ---");
            for (InvestmentTransaction inv : portfolio) {
                System.out.println(
                        inv.getTransactionId() + " | " +
                        inv.getInvestmentType() + " | " +
                        inv.getInvestedAmount()
                );
            }

        } catch (InvalidInvestmentException e) {
            System.out.println("Validation Error: " + e.getMessage());

        } catch (InvestmentRejectedException e) {
            System.out.println("Authorization Failed: " + e.getMessage());
        }
    }
}