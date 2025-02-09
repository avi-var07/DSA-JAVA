import java.util.Scanner;

class element_greater_than_right_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        int t_sum=0;
        
        for(int i=0;i<n;i++)
        t_sum+=arr[i];
        
        System.out.println("List of Elements which is greater than sum of elements to the element's right");
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<=i;j++)
            sum+=arr[i];
            
            int new_sum = t_sum - sum;
            
            if(new_sum<arr[i])
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}