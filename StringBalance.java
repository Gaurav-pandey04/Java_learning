// Status -> Completed
class StringBalance{
    public static void main(String[] args) {
        String s = "}{}{}{";
        int open = 0;
        int imbalance = 0;
        for(char ch: s.toCharArray()){
            if(ch == '{'){
                open++;
            }else{
                if(open>0)
                    open--;
                else
                    imbalance++;
            }
        }
        int result = (imbalance+1)/2;
        System.out.println(imbalance);
        System.out.println(result);
    }
}