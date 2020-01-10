class Job 
{
    double sal;
	String desg;
	Job()
	{
	}
	Job(double sal,String desg)
	{
		this.sal=sal;
		this.desg=desg;
	}
     String getJob()
	{
		 return desg;
		
	}
	double getsal()
	{
		return sal;
	}
	void setJob(double sal,String desg)
	{
		this.desg=desg;
		this.sal=sal;
	}

	void jobdetails()
	{
		System.out.println(desg +":looking for a job");
	}
}


class Man
{
	String name;
	Job j;
	Man()
	{
	}
	Man(String name)
	{
		this.name=name;
	}

	void work()
		{
		j=new Job(20000,"Developer");
		System.out.println(name+":got a job as " + j.getJob() + "with salary:"+j.getsal());
		}
}
 class Driver1
 {
	 public static void main(String[] args)
	 {
		 Man m=new Man("nikhil");
         System.out.println(m.name);
		 if(m.j!=null)
		 {
           System.out.println("jobless");
		 }
		 else
		 {
			 m.work();
		 }
		 
	 }
	 }