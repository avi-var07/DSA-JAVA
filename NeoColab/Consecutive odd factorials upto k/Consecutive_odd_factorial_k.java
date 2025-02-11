/*
 Single File Programming Question
Problem Statement



Ethan is performing a mathematical operation where he calculates the sum of factorials of the first K consecutive odd numbers starting from a given number N. If N is even, it is incremented to the next odd number before starting the sequence. 



Write a program to compute the sum of factorials for this sequence.



Example



Input:

4 3

Output:

368040

Explanation:

Start with N=4, which is even. Increment to 5.

The first 3 consecutive odd numbers are 5, 7 and 9.

Calculate their factorials: 

5!=120 
7!=5040
9!=362880
Sum: 120+5040+362880=368040.

Input format :
The input consists of two space separated integers N and K, representing the starting number and number of consecutive odd numbers.

Output format :
The output prints sum of the factorials of the first K consecutive odd numbers starting N.



Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ N ≤ 10

1 ≤ K ≤ 5

Sample test cases :
Input 1 :
4 3
Output 1 :
368040
Input 2 :
1 2
Output 2 :
7
 */


import java.util.Scanner;
class Consecutive_odd_factorial_k{
    static long fact(int n){
        long f=1;
        for(int i=2;i<=n;i++)
        f*=i;
        
        return f;
    }
    static void sum_of_fact(int n, int k){
        int count =0;
        long sum=0;
        while(count<k){
            sum+=fact(n);
            n+=2;
            count++;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n and k");
       int n = sc.nextInt();
       int k = sc.nextInt();
       if(n%2==0){
           n+=1;
           sum_of_fact(n,k);
       }
       else{
           sum_of_fact(n,k);
        }
        sc.close();
    }
}