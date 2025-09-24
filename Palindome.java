import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String revString = "";
        for(int i = 0;i<str.length();i++)
        {
            revString =   str.charAt(i) + revString ;
        }
        if(str.equals(revString))
            System.out.println("Given string is a palindrome");
        else
            System.out.println("Given string is not a palindrome");

    }
}