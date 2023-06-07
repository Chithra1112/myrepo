package reviewques;

public class Review {
	int age;
	String b;
	Review(int c,String name)
	{
	age=c;
	b=name;
	}
	public void display()
	{
	System.out.println("Roll No:" +age);
	System.out.println("Name:" +b);
	}
	public static void main(String args[])
	{
	Review obj=new Review(10,"Chithra");
	Review obj1=new Review(11,"Tijo");
	Review obj2=new Review(12,"Florence");
	Review obj3=new Review(13,"Chinchu");
	Review obj4=new Review(14,"Nisha");
	obj.display();
	obj1.display();
	obj2.display();
	obj3.display();
	obj4.display();
	}
	}

