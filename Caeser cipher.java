package cipher;
import java.util.*;

public class En 
{
	public static void main(String args[])
	{
	int i,j,n,d,k,l=0,t=0;
	char[] a="abcdefghijklmnopqrstuvwxyz".toCharArray();
	char[] b="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	char[] f=new char[100];
	//char[] g=new char[10];
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	k=sc.nextInt();
	for(i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' ')
		{
			f[l++]=' ';
			System.out.print(" ");
		}
		for(j=0;j<=25;j++)
		{
		 if(s.charAt(i)==a[j])
		  {
	       d=j+k;
			
			if(d>0)
			{
				System.out.print(a[(j+k)%26]);
				f[l++]=a[(j+k)%26];
				break;
			}
			else
			{
		     System.out.print(a[j+k]);
		     f[l++]=a[(j+k)];
		     break;
			}
		  }
		 else if(s.charAt(i)==b[j])
		 {
                d=j+k;
			
			if(d>0)
			{
			
				System.out.print(b[(j+k)%26]);
				 f[l++]=b[(j+k)%26];
				break;
			}
			else
			{
		     System.out.print(b[j+k]);
		     f[l++]=b[(j+k)];
		     break;
			}
		 }
		}
	}
	System.out.println(" ");
	
	/*System.out.println(f);
	System.out.println(g);
	*/
	
	
	for(i=0;i<s.length();i++)
	{
		if(f[i]==' ')
		{
			System.out.print(" ");
		}
		for(j=0;j<=25;j++)
		{
		 if(f[i]==a[j])
		 {
	       d=j-k;
			
			if(d<0)
			{
			
				System.out.print(a[26+(j-k)]);
				break;
			}
			else
			{
		     System.out.print(a[j-k]);
		     break;
			}
		 }
		 else if(f[i]==b[j])
		 {
                d=j-k;
			
			if(d<0)
			{
			
				System.out.print(b[26+(j-k)]);
				break;
			}
			else
			{
		     System.out.print(b[j-k]);
		     break;
			}
			
		 }	
		}	
	}
  }
}
