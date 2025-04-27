
import java.util.*;

class StrictlyGreater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)arr.add(sc.nextInt());

        if(n==0)System.out.println("[]");

        else{
            ArrayList<Integer> ans = new ArrayList<>();
            System.out.print("["+arr.get(0));
            for(int i=1;i<n;i++)if(arr.get(i)>arr.get(i-1))ans.add(arr.get(i));

            for(int ele: ans) System.out.print(","+ele);
            
            System.out.print("]");
        }
        
        sc.close();
    }
}