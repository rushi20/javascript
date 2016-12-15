package demo;

public class test3 {
	 public static void main(String[] args) { 
	    	int n=19;
	    	
	    	/*first triangal*/
	    for(int i=0;i<=n;i++)  {
	        for(int j=0;j<(n-i);j++)
	            System.out.print(" ");
	        for(int k=0;k<(2*i+1);k++)
	            System.out.print("*");
	        System.out.println();
	      }
	    /*middel part*/
	    for(int x=n+1-2;x>1;x--){
	    	
	    for(int i=1;i<x+1;i++)  {
	    	
	        for(int j=0;j<(n-i);j++)
	            System.out.print(" ");
	        for(int k=0;k<(2*i+1);k++)
	            System.out.print("*");
	        System.out.println();
	      
	    	}
	    	//;
	      }
	    
	   /* stand*/
	    for(int i=0;i<2;i++)  {
	        for(int j=0;j<(n);j++)
	            System.out.print(" ");
	        for(int k=0;k<1;k++)
	            System.out.print("*");
	        System.out.println();
	      }
	    }
}
