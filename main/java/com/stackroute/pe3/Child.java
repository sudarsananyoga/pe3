package com.stackroute.pe3;

import java.io.IOException;

public class Child
{
	static String s="";
	Child(String s){
		this.s=s;
	}
	void mthd()
	{
		try {
	         Exception e=null;
	         throw e;
	        
	      }
	      catch (Exception e) { 
	        
	         System.out.println(s);
	      }
	      
	      finally {
	      System.out.println("I'm out of try-catch block in Java.");
	   }
	}
		   public static void main(String args[]) {
			   Child c=new Child("msg");
		    c.mthd();
		      
		}
}