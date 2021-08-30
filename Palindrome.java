import java.util.Scanner;
 
public class Palindrome {
 
 public static void main(String[] args) {
 
  String str = "madam";
  String reverseStr = "";
 
  for(int i = str.length() - 1; i >= 0; i--){
   reverseStr = reverseStr + str.charAt(i);
  }
 
  if(str.equals(reverseStr)){
   System.out.println("String is palindrome");
  } else {
   System.out.println("String is not palindrome");
  }
 }
}
