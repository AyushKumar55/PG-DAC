package core;

public class BankStatement {
	private String TransactionDate;
	private String Narration;
	private double WithdrawlAmount;
	private double DepositAmount;
	
	public BankStatement(String transactionDate, String narration, double withdrawlAmount, double depositAmount) {
		super();
		TransactionDate = transactionDate;
		Narration = narration;
		WithdrawlAmount = withdrawlAmount;
		DepositAmount = depositAmount;
	}
	
	@Override
	public String toString() {
		return "BankStatement [TransactionDate=" + TransactionDate + ", Narration=" + Narration + ", WithdrawlAmount="
				+ WithdrawlAmount + ", DepositAmount=" + DepositAmount + "]";
	}
	
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getNarration() {
		return Narration;
	}
	public void setNarration(String narration) {
		Narration = narration;
	}
	public double getWithdrawlAmount() {
		return WithdrawlAmount;
	}
	public void setWithdrawlAmount(double withdrawlAmount) {
		WithdrawlAmount = withdrawlAmount;
	}
	public double getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		DepositAmount = depositAmount;
	}
}
