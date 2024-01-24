import java.util.Scanner;
public class RBI {
    Scanner sc = new Scanner(System.in);
    String Accountnumber;
	String FirstName;
	String LastName;
	float OpeningBalance;
	String AccountType;
	
	RBI( String Accountnumber,String FirstName,String LastName,float OpeningBalance,String AccountType)
	{
		this.Accountnumber = Accountnumber;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.OpeningBalance = OpeningBalance;
		this.AccountType = AccountType;
	}
	
	private static int BankingFund = 500000000;
	static int Deposite;
	static int WithDraw;
	static int transaction;
	
	float num ;

	
	public void Details()
	{
		System.out.println("Total Banking Fund:- "+BankingFund);
		
	}
	
	public int getBankingFund()
	{
		return BankingFund;
	}
	
	public void DE() 
	{
		System.out.println("Enter Deposite Money:- ");
		float num = sc.nextFloat();
		num = num + OpeningBalance;
		System.out.println("Your Total Balance is:- "+num);
		System.out.println("********Thank You*******");
		
		
	}
	float WDraw()
	{
		
		System.out.println("Enter Amount to WithDraw:- ");
		float num = sc.nextFloat();
		
		
		if(num>OpeningBalance)
		{
			System.out.println("Not Sufficient Balance");
			return 1;
		}
		num = OpeningBalance - num;
		System.out.println("Your Total Balance is:- "+num);
		System.out.println("********Thank You*******");
		return 0;

	}
	public void Trasac()
	{
		System.out.println("Last Transaction:- "+OpeningBalance);
		System.out.println();
	}
	
}
