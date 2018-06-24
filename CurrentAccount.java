package program3;

public class CurrentAccount extends Account{
	int tradeLicenseNumber;
	public CurrentAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
			}
	
	public void withdraw(double amount){

		if(amount<getBalance())
		{
			setAccountBalance(getBalance()-amount);
	}else{
		System.out.println("Insuficient Balance");
	}
		
}
}
