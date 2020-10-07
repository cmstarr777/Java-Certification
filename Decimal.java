package myNewApps;

import java.util.ArrayList;
import java.util.Collections;

public class Decimal 
{
	
	 public static String decToBin(int decnum)
	 {
			int number=0;
			String binarys="";
			ArrayList<String> binary = new ArrayList<String>();				
			
			while(decnum != 0)
			{
				binary.add(String.valueOf(decnum%2));
				decnum /= 2;
			}
			
			Collections.reverse(binary);
			System.out.print("Binary number is ");
			
			for(String s : binary)
			{
				System.out.print(s);
				binarys += s;
			}
			return binarys;
		}
	    

	 
	 public static String decToHex(int decimal)
	 { 
		 
	     int rem;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	    while(decimal>0)  
	     {  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
	     }  
	    return hex;  
	}    
}