package com.stackroute.pe3;

public class Consec 
{
	public boolean consecCheck(String str) 
	{
	  String[] str1=str.split(",");
	  
	  int arr[]=new int[str1.length];
	  for(int i=0;i<str1.length;i++) {
		
		  arr[i]=Integer.parseInt(str1[i]);
	  }
	  
	  int count=1;
	  for(int i=0;i<arr.length-1;i++)
	  {
		  if(arr[i]==arr[i+1]+1)
		  {
			  count++;
		  }
	  }
	  if(count==arr.length)
	  {
		  return false;
	  }
	  else
	  {
		  return true;
	  }
	}
}