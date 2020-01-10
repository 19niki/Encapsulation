class Account 
{
	private int accno;
	String name;
	private double bal;
	 double getBal()
	{
		return bal;
	}
	Account()
	{

	}
	Account(int accno,String name, double bal)
	{
		this.accno=accno;
		this.name=name;
		this.bal=bal;
	}
	double deposit(int amount)
	{
		bal=bal+amount;
		return bal;
	}
	void withdraw(int amount)
	{ 
		if(bal>=amount)
		{

		bal=bal-amount;
		System.out.println("Sucessfully debited:"+amount);
		System.out.println("your balance is:");
		}
		else 
			{
			System.out.println("insufficent funds cannot able to debit:"+amount);
			}
		
	}
	
}
