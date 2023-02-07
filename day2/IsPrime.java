package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int n=7;
		boolean primeCheck=true;
		
        for(int i=2;i<=n-1;i++) {
        	
        	if((n%i)==0) {
        		System.out.println(n+" is a not prime number");
        		primeCheck=false;
        		break;
        	}
        
        	}
        if(primeCheck==true) {
    		System.out.println(n+" is a prime number");
    	}

}
	}