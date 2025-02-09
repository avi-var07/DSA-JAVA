import java.util.Scanner;

class gcd_and_lcm_using_euclidean {
    static int gcd(int a, int b){

        while(a>0&&b>0){
            if(a>b)
            a=a%b;
            else
            b=b%a;
        }
        if(a==0)
        return b;
     
        return a;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("HCF IS: "+gcd(a,b));
        System.out.println("LCM IS: "+(a*b)/gcd(a,b));
        sc.close();
    }
}