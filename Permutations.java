
import java.util.Scanner;
public class Permutations{
public static void printPerm(String str, String permutation){
if(str.length()==0){
 System.out.println("permutation is : " +permutation);}
for(int i=0;i<str.length();i++){
 char currChar =str.charAt(i);
  String newStr=str.substring(0,i)+str.substring(i+1);
  printPerm(newStr,permutation+currChar);

}
}
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter any word you want to find permutation of ");
String str=sc.nextLine();
printPerm(str, "");
 }
}