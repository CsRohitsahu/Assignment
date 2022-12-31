import java.util.Scanner;
public class Operator {

// Function that count set bits 
public static int countSetBits(int n) 
{ 
    int count = 0; 
    while (n != 0) { 
        count += n & 1; 
        n >>= 1; 
    } 
    return count; 
} 

// Function that return count of 
// flipped number 
public static int FlippedCount(int a, int b) 
{ 
    // Return count of set bits in 
    // a XOR b 
    return countSetBits(a ^ b); 
} 
  
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  //Q1 Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//is taken with 5 and then multiply the resultant value by 5. Display the final result.
  /* System.out.println("Enter value of x");
    int x=sc.nextInt();
    x+=8;
    int quotient=x/3;
    int mod=quotient%5;
    int result=mod*5;
    System.out.println("result is "+result); */

    //Q2 Swap two numbers without the use of third variable.
   /*  System.out.println("enter two no.");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("before swapping:a="+a+ " b="+b);

    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swapping a="+a+" b="+b);
*/
//Q3 Write a program to calculate the sum of the digits of a 3-digit number.
/*System.out.println("enter no.");
int x=sc.nextInt();
int sum=0;
for(int i=0;i<3;i++){
    sum+=x%10;
    x/=10;

}
System.out.println("sumf of digit of entered no is "+sum);*/

//Q4 i) both the conditions 'a < 50' and 'a < b' are true.
//ii) at least one of the conditions 'a < 50' or 'a < b' is true.
/*int a=55;
int b=70;
System.out.println(a<50&&a<b);
System.out.println(a<50||a<b);*/

//Q4 Find the total number of bits needed to be flipped to convert x to y.
int a = 10; 
int b = 20; 
System.out.print(FlippedCount(a, b)); 

    }
    
}
