import java.util.Scanner;
class Venue
{
	String name;
	String city;
}
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Venue v=new Venue();
		
		System.out.println("enter the venue name:");
		v.name=s.nextLine();

		System.out.println("enter the city name:");
		v.city=s.nextLine();

		System.out.println("Venue details:");
		System.out.println("venue name:"+v.name);
		System.out.println("city name:"+v.city);
		
	
			
	}
}


