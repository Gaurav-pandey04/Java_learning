public class WrapItUp {
    public static int counter(int startIndex, int len, char target, String str){
        int count = 0;
        for(int i=startIndex; i<len; i++){
            if (str.charAt(i)==target) {
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "I worrrk att Ignnnnniiiiiite";
        String res = "";
        int start = 0;
        while(start<str.length()-1){
            int result = counter(start, str.length()-1, str.charAt(start), str);
            if(result<2)
                res += str.charAt(start);
            else
                res += result +""+ str.charAt(start);
            start += result;
        }
        System.out.println(res);
    }
}