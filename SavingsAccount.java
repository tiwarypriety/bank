package program3;

public class SavingsAccount extends Account
{
	final double interest = 5;
	double max_limit;
	private double minBalance = 500;
	
public SavingsAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
void max_limit(double max_limit){
	this.max_limit = max_limit;
	
}
void  withdraw(double amount)
{
	if((minBalance+amount)<max_limit)
	{
		setAccountBalance(getBalance()-amount);
	}else
	{
		System.out.println("Maximum limit Exceeds");
	}
}

}
