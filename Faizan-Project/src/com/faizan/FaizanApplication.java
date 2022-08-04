package com.faizan;

import java.util.*;

public class FaizanApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:- ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		System.out.print("Enter the number do you want:- ");
		int max=sc.nextInt();
		
		List<Integer> l=new ArrayList<Integer>();
		
		for(int i=0;i<max;i++)
		{
			l.add(i, arr[i]);
		}
 
		System.out.println();
		
		for (Integer list : l) {
			
			System.out.print(list+" ");
			
		}
	}

}
