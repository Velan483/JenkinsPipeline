package com.velan.testsample;

public class App {
	
	private App() {
    }
	
	//Compare String Using Integer Function
    public static int compareString( String str1,String str2 )
    {
        if(str1.equals(str2)) {
        	return 1;
        }
        else {
		    return 0;
        }
    }
    
    //Sum of the Array
    public static int sum(int[] val) {   	
    	int total=0;
    	for(int i=0;i<val.length;i++)
    		total+=val[i];
    				
        return total;	
    }
    
    //Compare String Using Boolean Function
    public static boolean compareString1(String str1, String str2) {
        return str1.equals(str2);
    }

    
    // Sum of the digit
    public static int sumOfDigit(int n) {   	
    	int sum=0;
    	while(n>0) {
    	 sum+=n%10;
    	 n/=10;
    	}			
        return sum;	
    }
    
    //Maximum Value of the Digits
     public static int maxOfDigit(int n) {   	
    	int temp=0;
    	int max=0;
    	while(n>0) {
    	 temp=n%10;
    	 if(max<temp) {
    		 max=temp;
    	 }
    	 n/=10;
    	}			
        return max;	
    }
     
    //Increasing Order of Digit
     public static boolean incOrderOfDigit(int n) {   	
    	String str = Integer.toString(n);
      	for(int i=0;i<str.length()-1;i++) {
      		if(str.charAt(i) >= str.charAt(i+1)) {
      			return false;
      		}
      	}
      	return true;
   } 
     
   //Fibonacci Series
     public static int fibonacci(int n){
        int n1=0;
        int n2=1;
        int n3;    
        for(int i=2;i<n;++i){    
     		n3=n1+n2;      
     		n1=n2;    
     		n2=n3;    
     	}
     	return n2;
     }
     
     //Prime Number
     public static int prime(int n){
 		int flag=0;
 		if(n==1 || n==0){
 			flag=1;
 		}
 		if(n>1){
 			for(int i=2;i<n;i++){
 				if(n%i==0){          
 				flag=1;      
 				break;      
 			    }      
 			 }
 		}
 		return flag;
 	}   
     
    
}
