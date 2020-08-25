import java.util.Scanner;
class Delivery
{
	Long over;
	Long ball;
	Long runs;
	String batsman;
	String bowler;
	String nonStriker;

	

	void displayDeliveryDetails()
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the over:");
		over=s.nextLong();

		System.out.println("enter the ball:");
		ball=s.nextLong();

		System.out.println("enter the runs:");
		runs=s.nextLong();
		
		System.out.println("enter the batsman name:");
		batsman=s.next();
		
		
		System.out.println("enter  the bowler name:");
		bowler=s.next();


		System.out.println("enter the nonstriker name:");
		nonStriker=s.next();


		System.out.println("Delivery details");
		System.out.println("Over:"+over);
		System.out.println("Ball:"+ball);
		System.out.println("runs:"+runs);
		System.out.println("batsman:"+batsman);
		System.out.println("Bowler:"+bowler);
		System.out.println("nonstriker:"+nonStriker);
		
		
	}
}
class MainDemo
{
	public static void main(String args[])
	{
		Delivery d=new Delivery();
		d.displayDeliveryDetails();
	
			
	}
}


