import java.util.*;
class Student
{
	public static void main(String args[])
	{
		String grade;
		float percan;
		int total,m1,m2,m3,m4,m5;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name   : ");
		String name=sc.nextLine();
		System.out.print("Enter your Roll NO: ");
		String roll=sc.nextLine();
		System.out.print("Tamil Mark        : ");
	    m1=sc.nextInt();
		System.out.print("English Mark      : ");
		m2=sc.nextInt();
		System.out.print("Maths Mark        : ");
		m3=sc.nextInt();
		System.out.print("Science Mark      : ");
		m4=sc.nextInt();
		System.out.print("Social Mark       : ");
		m5=sc.nextInt();
		total=m1+m2+m3+m4+m5;
		percan=total/5;
		if(percan>=90)
		{
			grade="A";
		}
		else if(percan>=80)
		{
			grade="B";
		}
		else if(percan>=70)
		{
			grade="C";
		}
		else if(percan>=60)
		{
			grade="D";
		}
		else if(percan>=50)
		{
			grade="E";
		}
		else if(percan>=40)
		{
			grade="F";
		}
		else
		{
			grade="Fail";
		}
		System.out.println();
		System.out.println();
		System.out.println("Student Mark List");
		System.out.println("  ---*******---  ");
		System.out.println("Name      : "+name);
		System.out.println("Rollno    : "+roll);
		System.out.println("Tamil     : "+m1);
		System.out.println("English   : "+m2);
		System.out.println("Maths     : "+m3);
		System.out.println("Science   : "+m4);
		System.out.println("Social    : "+m5);
		System.out.println("Total     : "+total);
		System.out.println("Percantage: "+percan+"%");
		System.out.println("Grade     : "+grade);
	} 
}