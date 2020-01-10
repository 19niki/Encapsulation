class Acdriver 
{
	public static void main(String[] args) 
	{
		Account a=new Account(1,"NIKI",5000);
      /*  System.out.println(a.bal);
		a.deposit(5000);
		System.out.println(a.bal);
		a.bal=5000;
		*/
		System.out.println(a.getBal());
		a.deposit(5000);
		System.out.println(a.getBal());
		a.deposit(1000);
		System.out.println(a.getBal());
		a.withdraw(5000);

        System.out.println(a.getBal());
		a.withdraw(7000);
		System.out.println(a.getBal());
	}
}
