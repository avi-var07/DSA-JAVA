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