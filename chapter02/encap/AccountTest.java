public class AccountTest {
	public static void main(String[] args) {
		//创建 Account
		Account account1 = new Account();
		account1.setName("jack");
		account1.setBalance(600);
		account1.setPwd("123456");
		
		account1.showInfo();

		//创建 Account
		Account account2 = new Account();
		account2.setName("jack123456");
		account2.setBalance(6);
		account2.setPwd("123");
		
		account2.showInfo();
		
	}
}
