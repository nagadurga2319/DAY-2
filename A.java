import java.util.*;
class ExtraType
{
	 String name;
	 long runs;
	

	Public void setName(String name)
	{
		this.name=name;
	}
	
	
	Public void setRuns(long runs)
	{
		this.runs=runs;
	}
	Public String getName()
	{
		return name;
	}
	Public long getRuns()
	{
		return runs;
	}

}

class A
{
	public static void main(String args[])
	{
		
		
		Scanner s=new Scanner(System.in);
		ExtraType et=new ExtraType();
		
		System.out.println("enter ExtraTyepe details:");
		String de=s.nextLine();
		String[] a=de.split("#",-2);
		et.setName(a[0]);
	        long run=Long.parseLong(a[1]);
		et.setRuns(run);
		
		
		System.out.println("ExtraType details:");
		System.out.println("ExtraType:"+et.getName());
		System.out.println("Runs:"+et.getRuns());
		
	}

}
		

		
		
		

