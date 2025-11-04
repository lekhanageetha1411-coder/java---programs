public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "gadag";
        String reversedstr ="";
        //int str.length = n;

        for(int i = str.length()-1;i>=0;i--){
            reversedstr += str.charAt(i);
        }
        if(str.equals(reversedstr)){
            System.out.println("the letter is palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    
}
