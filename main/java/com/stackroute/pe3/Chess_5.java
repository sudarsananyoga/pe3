package com.stackroute.pe3;

public class Chess_5 {
	public String[][] pattern()
	{
	String[][] str=new String[8][8];
   String s1="WW|";
   String s2="BB|";
   for(int i=0;i<8;i++)
   {
	   for(int j=0;j<8;j++)
	   {
		   if(((i+j)%2)==0)
		    str[i][j]=s1;
		   else
			   str[i][j]=s2;
	   }
	   System.out.println(str);
   }
   
 return str;  		   
}
}