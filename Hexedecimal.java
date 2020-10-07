package myNewApps;

public class Hexedecimal {

	public static String hexToBin(String hex)
	{
		
		String decNum = hexToDec(hex);
        int intDecnum =Integer.parseInt(decNum);
        String strBiNum = Decimal.decToBin(intDecnum);
        return strBiNum;
        
	}

	public static String hexToDec(String hex)
	{  
	    String digits = "0123456789ABCDEF";  
	    String dec="";
	    hex = hex.toUpperCase();  
	    int val = 0;  
	    for (int i = 0; i < hex.length(); i++)  
	    {  
	          char c = hex.charAt(i);  
	          int d = digits.indexOf(c);  
	          val = 16*val + d;  
	    }
	    dec =String.valueOf(val);
	    return dec;  
	}  
	
}
