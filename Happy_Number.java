// Satus -> Completed

class HappyNumber{

    // Function to calculate sum of square of digits
    public static int sumOfSquare(int n){
        int sum = 0;
        while (n>0) {
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
        }while (slow!= fast);

        return slow==1;
    }    
    public static void main(String[] args){
       int number = 14;
       if(isHappy(number))
            System.out.println(number + " is a happy number");
       else
            System.out.println(number + " is not a Happy Number");
    }
}