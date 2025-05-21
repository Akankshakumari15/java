public class Compress_the_String {
    public static void main(String[] args) {
        String str= "aaabbccdddd"; //a3b2c2d4
        StringBuilder newStr = new StringBuilder();
        int count=1;
        for (int i=1;i<str.length();i++){
            if (i==str.length() || str.charAt(i)!=str.charAt(i-1)) {
                newStr.append(str.charAt(i-1)).append(count);
                count=1;  
            }
            else{
                count++;   
            }
        }
        System.out.println(newStr.toString());
    }
    
}
