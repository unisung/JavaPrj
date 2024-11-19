package yourPackage;

public class AccountMain {
	public static void main(String[] args) {
		Account myAccount = new Account();
		
		myAccount.name = "홍길동";
		myAccount.accountNumber ="002-122-011420";
		myAccount.passwd = "1234";
		myAccount.balance = 380000;
		myAccount.interest = 6.03F;
		
        Account myAccount2 = new Account();
		
		myAccount2.name = "임꺽정";
		myAccount2.accountNumber ="002-122-011330";
		myAccount2.passwd = "5678";
		myAccount2.balance = 380000;
		myAccount2.interest = 6.03F;
		//입금
		myAccount.saveMoney(50000);//380000+50000
		//출금
		myAccount.withdrawMoney(80000);//430000-80000
		long myBalance = myAccount.getBalance();
		System.out.println(myBalance);
	}
}
