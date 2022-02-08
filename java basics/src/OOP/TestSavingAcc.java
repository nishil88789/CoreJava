package OOP;

public class TestSavingAcc {
public static void main(String[] args) {
	Account a = new Account();
	a.setNo("3456");
	System.out.println(a.getNo());
	
	a.setAccountype("SavingAcc");
	System.out.println(a.getAccountype());
	
	a.setBalance(50000.00);
	Double d = a.getBalance();
			System.out.println(d);
    a.deposit(500.0);
    System.out.println(a.getBalance());
    a.withdraw(1000.00);
    System.out.println(a.getBalance());

}
}
