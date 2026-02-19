public class PraticeHappyNumber {
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit*digit;
            num /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int num){
        int slow = num;
        int fast = num;

        do{
            slow = sumOfDigit(slow);
            fast = sumOfDigit(sumOfDigit(fast));
        }while(slow!=fast);

        return slow==1;
    }
    public static void main(String[] args) {
        int num = 71;

        if(isHappy(num))
            System.out.println("Happy Number");
        else
            System.out.println("Not A Happy Number");
    }   
}