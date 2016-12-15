package demo;

public class testa {
	
	    public static void main(String[] args) { 
	    	int n=2;
	    	/*first triangal*/
	    for(int i=0;i<n;i++)  {
	        for(int j=0;j<n-i;j++)
	            System.out.print(" ");
	        for(int k=0;k<(2*i+1);k++)
	            System.out.print("*");
	        System.out.println();
	      }
	   /* stand*/
	    for(int i=0;i<2;i++)  {
	        for(int j=0;j<n;j++)
	            System.out.print(" ");
	        for(int k=0;k<1;k++)
	            System.out.print("*");
	        System.out.println();
	      }
	    }

	} 

