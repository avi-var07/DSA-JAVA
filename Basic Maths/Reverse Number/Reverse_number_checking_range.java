// 7.  Reverse Integer
// Solved
// Medium
// Topics
// Companies
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// Constraints:

// -231 <= x <= 231 - 1




import java.util.Scanner;

class Reverse_number_checking_range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        long rev=0;
        while(n!=0){
            long d=n%10;
            rev=rev*10+d;
            if(rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE){
                System.out.print("Enter value in range. Restart Program, now exiting");
                System.exit(0);
            }
            n/=10;
        }
        System.out.print(rev);
        sc.close();
    }
}