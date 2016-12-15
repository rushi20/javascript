package demo;

public class testa1 {
	public static void main(String[] args) {
	    drawChristmasTree(4);
	}

	 private static void drawChristmasTree(int n) {
	     for (int i = n; i >= n; i--) {
	         triangle(n,i+1);
	     }
	}

	 private static void triangle(int n, int max){
	     for (int i = 0; i < n; i++) {
	         for (int j = 0; j < max-i-1; j++) {
	             System.out.print(" ");
	         }
	         for (int j = 0; j < i*2+1; j++) {
	             System.out.print("X");
	         }
	         System.out.println("");
	     }
	 }
}
