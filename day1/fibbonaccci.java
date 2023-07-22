package week1.day1;

public class fibbonaccci {
	
	public static void main(String args[])
	{  
	 int a=0,b=1,c,i,count=11;  
	 System.out.print(a+" "+b); 
	  
	 for(i=0;i<count;i++)  
	 {  
	  c=a+b;  
	  System.out.print(" "+c);  
	  a=b;  
	  b=c;  
	 }  

}
}
