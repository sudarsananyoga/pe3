package com.stackroute.pe3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exeptn_8 {
	public String sizeNegative(int size) {
		
	   try {
		   
		int[] array = new int[size];
          
		return "Negative array size";
	}
	   catch(NegativeArraySizeException ex)
			   {
		           return "null";
			   }
	}
	public String nullExep() {
		String ptr=null;
		try
        {
            if (ptr.equals("gfg")) {
                return "Same";
            }
        }
        catch(NullPointerException e)
        {
                return "NullPointerException Caught";
        }
		return null;
	}
	public String outOfBound( int index) {
		 
		    try
		    {
		    	int[] array = new int[index];                         
		      return "Do not cross size of array si";
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		      return null;
		    }
	}
}
