package org.strings;

import java.util.Scanner;

public class StringDup 
{
	public static void main(String [] args) 
	{
        String str;
        char ch;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=scan.nextLine();
        
       int i=str.length();
       
        for(char c='A'; c<='z'; c++)
        {
        	int k=0;
            for(int j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }
        }
	}
}