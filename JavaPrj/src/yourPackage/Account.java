package yourPackage;

public class Account {
	//변수 선언
	public String name;//고유값
	public String accountNumber;//고유값
	public String passwd;//고유값
	
	public long balance;//현재 상태
	public float interest;//현재 상태
	//메소드 선언
	//입금 업무기능
	public void saveMoney(long amount) {
		balance = balance + amount;
	}
	//출금 업무기능
	public void withdrawMoney(long amount) {
		balance = balance - amount;
	}
	//현재 잔고 조회 기능
	public long getBalance() {return balance;}
}//설계도 끝.