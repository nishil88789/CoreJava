package OOP;

public class Account {
 private String no = null;
 private String accountype = null;
 private Double balance = 0.00;
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getAccountype() {
	return accountype;
}
public void setAccountype(String accountype) {
	this.accountype = accountype;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
 public Double deposit(double d) {
	 balance = balance+d;
	 return balance;
 }
 public Double withdraw(double w) {
	 balance = balance-w;
	 return balance;
 
 }
}
