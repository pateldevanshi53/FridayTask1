import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
       System.out.print("Input the number of rows: ");
       int num = input.nextInt();
       
       for(int i =0; i<=num; i++){
    	   for(int j=0; j<i; j++){
    		   System.out.print("* ");
    	   }
    	   System.out.println(" ");
       }
       
       
	}

}
