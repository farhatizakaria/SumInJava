
package algorithm;

import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {
        // Inputing
        Scanner input = new Scanner(System.in);
        // Variables
        
        int a;
        int b;
        int sum;
        
        
        // Instructions
        System.out.println("Enter the first number ");
        
        a = input.nextInt();
        
        System.out.println("Also the second number ");
        b = input.nextInt();
        
        sum = (a + b);
        
        System.out.print(sum);
    }
    
}
