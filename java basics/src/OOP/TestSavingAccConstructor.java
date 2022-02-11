package OOP;

public class TestSavingAccConstructor {
public static void main(String[] args) {
	AccountConstructor a = new AccountConstructor();
	
	a.setAccountNumber("123456789");
	System.out.println(a.getAccountNumber());
    
	a.setAccountType("Saving Account");
   System.out.println(a.getAccountType());

   a.setBalance(100.00);
   System.out.println(a.getBalance());
   
   a.deposit(5000);
   System.out.println(a.getBalance());
   
   a.withdraw(2000);
   System.out.println(a.getBalance());
   
   AccountConstructor s = new AccountConstructor("123 shyam","current",500);
   
   System.out.println(s.getAccountNumber());
   System.out.println(s.getAccountType());
   System.out.println(s.getBalance());
}
}