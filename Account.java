package program3;

import java.util.Random;

public class Account
{
private String memberName;
String accountNumber;
private static double accountBalance  ; 
public Account(String memberName, double accountBalance) {
	super();
	this.memberName = memberName;
	this.accountBalance = accountBalance;
}
 void deposite(double amount)
{
	 if(amount>0)
	 {
	setAccountBalance(getBalance()+amount);
	System.out.println("Amount Deposited! Available Balance = "+getBalance());
     }
	 else
	 {
	 System.out.println("Invalid amount");
    }
}
 
 
 
public String getMemberName() {
	return memberName;
}

public double getBalance() {
	return accountBalance;
}

public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
void display(){
	System.out.println("Balance = "+getBalance());
}
void generateAccountNumber(){
	Random rand = new Random();
	 accountNumber = 10000 + rand.nextInt(89999) + "";
	 System.out.println("Account Number = "+accountNumber);
	 System.out.println("*****************************");
}

}
