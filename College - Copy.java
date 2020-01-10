// example for early binding
class Student
{
	String name;
	void course()
	{
		System.out.println("student is studying in this course");
	}
	void attendence()
	{
		System.out.println("student has got this amount of percentage");
}
}

class College
{
	String name;
	Student s=new Student();
	College()
	{

	}
	College(String name)
	{
		this.name=name;
	}
	void collegedetails()
	{
     System.out.println("college name:"+ name);
	}
	void coursesavl()
	{
		System.out.println("this are the courses avalible");
	}
}


