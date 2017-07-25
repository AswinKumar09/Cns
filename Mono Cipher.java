package pro1;
import java.util.*;

public class Mono 
{
	public static void main(String args[])
	{
     int i,j,n,b;
	 char[] a="zyxwvutsrqponmlkjihgfedcba".toCharArray();
	 char[] e="ZYXWVUTSRQPONMLKJIHGFEDCBA".toCharArray();
	 String s;
	 String m=new String();
	 String g=new String();
	 Scanner sc=new Scanner(System.in);
	 s=sc.nextLine();
	 for(i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)==' ')
		 {
			 m=m+' ';
		 }
		 for(j=0;j<=25;j++)
		 {
			
		   if(s.charAt(i)==a[j])
		   {
			   b=25-j; 
		       m=m+a[b];  
		   }
		   else if(s.charAt(i)==e[j])
		   {
			   b=25-j;
			   m=m+e[b];
		   }
		 }
	 }	
	 System.out.print("Encryption is:"+m);
	 System.out.println();
	 
	 
	 
	 for(i=0;i<s.length();i++)
	 {
		 if(m.charAt(i)==' ')
		 {
			 g=g+' ';
		 }
		 for(j=0;j<=25;j++)
		 {
			
		   if(m.charAt(i)==a[j])
		   {
			   b=25-j; 
		       g=g+a[b];  
		   }
		   else if(m.charAt(i)==e[j])
		   {
			   b=25-j;
			   g=g+e[b];
		   }
		 } 
	 }
	 System.out.println("Decryption is:"+g);	
   }
	
	
}
