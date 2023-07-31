package IMP_Java__Problem;
public class PalindromeNumber {
    public static void main(String[] args) {
        int number=1216;
        int temp=number;
        int rem;
        int rev=0;
         while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
         }
         if(number==rev){
            System.out.println("the number is palindrome");
         }
         else{
            System.out.println("the number is not palindrome");
         }
    }
}
