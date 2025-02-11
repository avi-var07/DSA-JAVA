
/*Single File Programming Question
Problem Statement



Hagrid needs a program capable of performing two calculations: square roots and cube roots. 

When he inputs an integer value, the program calculates the square root and displays the result. 
Likewise, if he enters a double, he anticipates the program to compute the cube root and display the outcome. 


Create a program that enables Hagrid to input a number and then see the result of the respective root calculation. Use method overloading with the name calculateRoot() for this and also sqrt() and cbrt() functions from the Java library.

Input format :
The input consists of either an integer n or a double value d, representing the numerical value entered by Hagrid.

Output format :
If the input is an integer, the output displays the square root of n rounded to one decimal place.

If the input is a double value, the output displays the cube root of d rounded to one decimal place.



Refer to the sample output for the formatting specifications.

Code constraints :
1 ≤ n ≤ 10000

1.0 ≤ d ≤ 10000.0

Sample test cases :
Input 1 :
4
Output 1 :
2.0
Input 2 :
27.0
Output 2 :
3.0
Input 3 :
1000
Output 3 :
31.6
Input 4 :
1000.00
Output 4 :
10.0 */
import java.util.Scanner;
class check_input_type{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        System.out.printf("%.1f",Math.sqrt(sc.nextInt()));
        else
        System.out.printf("%.1f",Math.cbrt(sc.nextDouble()));
        sc.close();
        
    }
}