import java.util.Scanner;

public class PracticeCrazyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        long[] arr = new long[T];
        
        for(int i = 0; i<T; i++ )        
            arr[i] = sc.nextLong();

        for(long ele: arr){
            long digit = 0;
            long sum = 0;
            long temp1 = ele;
            long temp2 = ele;
            
            while (temp1>0) {
                digit++;
                temp1 /= 10;
            }

            while (temp2>0) {
                long remainder = temp2%10;
                sum += Math.pow(remainder, digit);
                temp2 /= 10;
            }

            if(sum==ele)
                System.out.println("Crazy Number");
            else
                System.out.println("Not a crazy number");
        }

        sc.close();
    }
}
