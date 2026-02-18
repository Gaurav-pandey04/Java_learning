// Satus -> In-Complete (Infinte Loop)

import java.util.*;

class HappyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num!=1 && num!=4) {
            while (num>0) {
               int digit = num%10;
               sum += digit*digit;
               num = num/10;
            }
            num = sum;
        }
        if(num==1) System.out.println("Lucky Number");
        else System.out.println("Not A Lucky Number");
    }
}