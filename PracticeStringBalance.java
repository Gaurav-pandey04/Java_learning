public class PracticeStringBalance {
    public static void main(String[] args) {
        String s = "}}}{}{";
        int counter = 0;
        int imbalance = 0;
        for(char ch: s.toCharArray()){
            if(ch=='{'){
                counter++;
            }else{
                if(counter>0){
                    counter--;
                }else{
                    imbalance+=2;
                }
            }
        }
        int result = (counter/2)+imbalance;
        System.out.println(result);
    }
}
