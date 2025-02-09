import java.util.Scanner;

class Rotate_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();

        int m = sc.nextInt();

        if(m>n)
        m=n-m;

        for(int i=0;i<m;i++){
            int last = arr[n-1];

            for(int j=n-1;j>0;j--)
            arr[j]=arr[j-1];

            arr[0]=last;
        }

        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}