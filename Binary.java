package myNewApps;

public class Binary 
{
	
    int binum=0;
    
	Binary (int binnum )
	{
		this.binum=binnum;
	}
	
    public static String binToHex(int binum)
    {
        int binnum=binum; 
        int rem;
        String hexdecnum="";
        
        // digits in hexadecimal number system
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
        // converting the number in hexadecimal format
        while(binnum>0)
        {
            rem = binnum%16;
            hexdecnum = hex[rem] + hexdecnum;
            binnum = binnum/16;
        }
		
        System.out.print("Equivalent Hexadecimal Value of " +binnum+ " is :" + hexdecnum +"\n");
        return hexdecnum;
            
    }
    
    public static String binToDec(int decnum)
    {
        int decimal =decnum; 
        int p=0,n=0;
        String dec;
        
        while(n!=0)
        {
            decimal+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
        dec =String.valueOf(decimal);
        System.out.println(dec);
        return dec;
    }
    
}
