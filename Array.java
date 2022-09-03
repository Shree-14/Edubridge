import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
    		// TODO Auto-generated method stub
    		
    		Scanner scanner=new Scanner(System.in);
    		double[] salary=new double[5]; 
    		double searchSal;
    		
    		System.out.println("enter the 5 salaries");
    		for(int i=0; i<salary.length;i++)
    		{
    			salary[i]=scanner.nextDouble();
    		}
    		
    		System.out.println(" the 5 salaries are");
    		
    		for(Double s : salary)
    		{
    			System.out.println(s);
    		}
    		
    		System.out.println("enter the salary to search");
    		searchSal=scanner.nextDouble();
    		
    		boolean flag=false;
    		
    		for(Double s : salary)
    		{
    			if(s==searchSal)
    			{
    				flag=true;
    				break;
    			}else 
    				flag=false;
    		}
    		
    		if(flag==true)
    		System.out.println("found");
    		else
    		System.out.println("not found");
 }
}
