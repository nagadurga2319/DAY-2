import java.util.Scanner;
import java.util.Arrays;
class Player
{
	String name;
	String country;
	String skill;
}

class MainPlay
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Player pl=new Player();
		
		System.out.println("enter the Player details:");
		String name=s.nextLine();
		String[] a=name.split(",",-2);
		for(int i=0;i<a.length;i++)
		{
			pl.name=a[0];
			pl.country=a[1];
			pl.skill=a[2];
		}
			
		System.out.println("Player details:");
		System.out.println("Player name:"+pl.name);
		System.out.println("country name:"+pl.country);
		System.out.println("skill:"+pl.skill);
		
	
			
	}
}


