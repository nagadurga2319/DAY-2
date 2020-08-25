import java.util.Scanner;
import java.util.Arrays;
class Wicket
{
	private long over;
	private long ball;
	private long wicketType;
	private String playerName;
	private String bowlerName;
	
	
	Wicket(long over,long ball,long wicketType,String playerName,String bowlerName)
	
		this.over=over;
		this.ball=ball;
		this.wicketType=wicketType;
		this.playerName=playerName;
		this.bowlerName=bowlerName;
	}
		
		public void setOver(long over)
		{
			this.over=over;
		}
		public void setBall(long ball)
		{
			this.ball=ball;

		}
		public void setwicketType(Long wicketType)
		{
			this.wicketType=wicketType;
		}
		public void setPlayerName(String PlayerName)
		{
			this.PlayerName=PlayerName;

		}
		public void setbowlerName(String bowlerName)
		{
			this.bowlerName=bowlerName;

		}
		public long getOver()
		{
			return over;
		}
		public long getBall()
		{
			return ball;
		}
	
		public long getwicketTyper()
		{
			return wicketType;
		}
		
		public String getPlayerName()
		{
			return PlayerName;
		}
		public String getbowlerName()
		{
			return bowlerName;
		}
		
		
}
class D
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Wicket wt=new Wicket();
		
		System.out.println("enter the number of wickets:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("enter the details of:"+i);
		String over=s.nextLine();
		String[] a=over.split(",",-2);
		for(int j=0;j<a.length;j++)
		{
			wi.over=a[0];
			wi.ball=a[1];
			wi.wicketType=a[2];
			wi.playerName=a[3];
			wi.bowlerName=a[4];
		}
		}	
		System.out.println("Player details:");
		System.out.println("Player name:"+wi.getOver);
		System.out.println("country name:"+wi.getBall);
		System.out.println("skill:"+wi.getWicketType);
		System.out.println("skill:"+wi.getplayerName);
		System.out.println("skill:"+wi.getbowlerName);
		
		
}
}