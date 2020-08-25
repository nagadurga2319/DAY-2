import java.util.Scanner;
class Player
{
	String name;
	String country;
	String skill;
}
class Demo
{	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Player pl=new Player();
		
		System.out.println("enter the Player name:");
		pl.name=s.nextLine();

		System.out.println("enter the country name:");
		pl.country=s.nextLine();

		System.out.println("enter the skill:");
		pl.skill=s.nextLine();

		System.out.println("Player details:");
		System.out.println("Player name:"+pl.name);
		System.out.println("country name:"+pl.country);
		System.out.println("skill:"+pl.skill);
		
	
			
	}
}


