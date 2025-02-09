import java.util.Scanner;

class prime {
    static boolean check_prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(check_prime(n))
        System.out.println("Prime");
        else
        System.out.println("not Prime");
        sc.close();
    }
}