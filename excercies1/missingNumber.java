import java.util.*;

class missingNumber {
 
   public static int findMissing(int ar[], int n) {
        int count = 0;
        
       
        for(int i = 0; i < n - 1; i++) { 
            count += ar[i];
        }

        int total = n * (n + 1) / 2;

       
        return total - count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

      
        int n = s.nextInt();

        int ar[] = new int[n - 1]; 

    
        for (int i = 0; i < n - 1; i++) { 
            System.out.print("Enter arr[" + i + "]:");
            ar[i] = s.nextInt();
        }

        System.out.println("The missing number is: " + findMissing(ar, n));
    }
}
