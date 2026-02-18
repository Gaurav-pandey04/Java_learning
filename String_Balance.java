// String Balance -> Status - Under Review
class StringBalance{
    public static void main(String[] args) {
        String s = "{{{}{}}{";
        int counter = 0;
        int exception = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='{')
                counter += 1;
            else
                counter -= 1;
        }
        if(s.charAt(0)=='}' && s.charAt((s.length()-1))=='{')
            exception += 2;
        System.out.println((Math.abs(counter)/2)+exception);
    }
}