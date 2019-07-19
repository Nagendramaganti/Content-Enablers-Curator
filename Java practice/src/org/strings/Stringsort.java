package org.strings;

public class Stringsort {

	public static void main(String[] args) 
	
	{
		String s = "bcfaed";
		   char a[]=s.toCharArray();
		   
		   char count=0;
		   for(int i=0;i<a.length;i++)
		   {
		       count=0;
		       for(int j=0;j<a.length;j++)
		       {
		    	   if(a[i]<a[j])
		    	   {
		    		   count = a[i];
		    		   
		    		   a[i]=a[j];
		    		   a[j]= count;
		    	   }
		       }
		     
		       }
		   for(int k=0;k<a.length;k++)
	       {
	    	   System.out.print(a[k]);
		   }
		}
		
		// TODO Auto-generated method stub

	}


