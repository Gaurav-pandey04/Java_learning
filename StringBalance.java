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
                    imbalance+=2;
            }
        }
        System.out.println(open/2+imbalance);
    }
}