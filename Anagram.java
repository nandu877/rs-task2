import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String str1 = sc.next().toLowerCase();
        System.out.println("Enter the second string : ");
        String str2 = sc.next().toLowerCase();
        char[] carr1 = str1.toCharArray();
        char[] carr2 = str2.toCharArray();
        Arrays.sort(carr1);
        Arrays.sort(carr2);
        boolean res = Arrays.equals(carr1,carr2);
        if(res) {
            System.out.println("Given two strings are anagram");
        }
        else{
            System.out.println("Given two strings are not anagram");
        }
    }
}
