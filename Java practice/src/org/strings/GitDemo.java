package org.strings;

public class GitDemo {

	public static void main(String[] args)  //for array sorting using java selection sort
	{
		int a[] = {4,6,3,5,8,1};
		for(int i=0;i<a.length;i++)
		{
			int temp;
			for(int j=i+1;j<a.length;j++)
				
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]);
		}
		System.out.print("this is git --- editted in git oonline");

	}

}
