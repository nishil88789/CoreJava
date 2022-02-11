package OOP;

public class AccountConstructor {
 private String accountNumber;
 private String accountType;
 private double balance = 00.0; 

 public AccountConstructor() {}
public AccountConstructor(String s , String y , double d) {
	this.accountNumber = s;
	this.accountType = y;
	this.balance = d;
}
 public String getAccountNumber() {
 return accountNumber;
 }
 public void setAccountNumber(String accountNumber) {
	 this.accountNumber=accountNumber;
 }
 public String getAccountType() {
	 return accountType;
 }
 public void setAccountType(String accountType) {
	 this.accountType=accountType;
 }
 public double getBalance() {
	 return balance;
 }
 public void setBalance(Double balance) {
	 this.balance=balance;
 }
 public void deposit(double i) {
	 double d = getBalance();
	 d+=i;
	 setBalance(d);
}
 public void withdraw(double i) {
	 double d = getBalance();
	 d=i;
	 setBalance(d);
 }
}