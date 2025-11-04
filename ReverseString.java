public class ReverseString {
    public static void main(String[] args) {
        String str = "lekhana";
        String reversedstr = "";

        for(int i = str.length()-1;i >= 0;i--){                                // i = str.length() - 1 = str = lekhana = 7-1 = 6 start with 6,
                                                                              // till i = 0;i--- it will decrements ;
            reversedstr += str.charAt(i);                                    // this return character at position i
        }
        System.out.println("String :" +str);
        System.out.println("Reversed String :" + reversedstr);
    }
    
}
