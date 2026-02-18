// Status -> Completed
class CrazyNumber{
    public static void main(String[] args){
        int num = 1634;
        int counter = 0;
        int result = 0;
        int temp1 = num, temp2 = num;
        while(temp1>0){
            counter++;
            temp1 = temp1/10;
        }
        while (temp2>0) {
            int digit = temp2%10;
            result += Math.pow(digit, counter);
            temp2 = temp2/10;
        }
        if(result==num)
            System.out.println(num + " is crazy number");
        else
            System.out.println(num + " is not a crazy number");
    }
}