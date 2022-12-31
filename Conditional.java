import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q1 Write a program which takes the values of length and breadth from user and check if it is
//  a square or not.
   /*System.out.println("enter length and breadth:");

  int length =sc.nextInt();
   int breadth =sc.nextInt();
   if(length==breadth) System.out.println("It is square");
   else System.out.println("it is rectangle");*/

   //Q2 Write a program to print absolute value of a number entered by the user.
   /*System.out.println("enter no.");
   int n=sc.nextInt();
   int temp=n;
   if(n<0) n*=(-1);
   System.out.println("absolute value of "+temp+" is "+n);*/

  // Q3 Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or Loss.

      /*System.out.println("enter cost price and selling price");
       int cost=sc.nextInt();
       int sell=sc.nextInt();
       if(cost<sell) System.out.println("profit is "+(sell-cost));
       else if(cost==sell) System.out.println("no loss or no profit");

        else System.out.println("loss is "+ (cost-sell));*/

        //Q4 Write a program to print positive number entered by the user, if user enters a negative
          //number, it is skipped 
          /*System.out.println("enter no.");
          int x=sc.nextInt();
          while(x>=0){
            System.out.println("entered no. is "+x);
            System.out.println("enter again");
            x=sc.nextInt();
          }
          System.out.println("entered no. is negative and skipped ");*/


          //Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
  //and division.
    /*System.out.println("enter two no.");
  float n1=sc.nextFloat();
  float n2=sc.nextFloat();
  System.out.println("enter + for additon \nenter - for subtraction\nenter * for multiplication"+
  "\n enter / for divison");
  char  choice=sc.next().charAt(0);
  switch (choice) {
   case '+'-> System.out.println("sum is "+(n1+n2));
   case '-'-> System.out.println("subtraction is "+(n1-n2));
   case '*' -> System.out.println("multiplication is "+(n1*n2));
    case '/'-> System.out.println("division is "+(n1/n2)); 
   default-> System.out.println("wrong choice chosen for operartion");
     
  }*/

  // Q6 Q6 - Write a program to calculate marks to grades
  System.out.println("enter your marks ");
  int marks=sc.nextInt();
  if(marks<=100&&marks>90) System.out.println("grade is A+");
  else if(marks<=90&&marks>80) System.out.println("grade is A");
  else if(marks<=80&&marks>70) System.out.println("grade is B+");
  else if(marks<=70&&marks>60) System.out.println("grade is B");
  else if(marks<=60&&marks>50) System.out.println("grade is C");
  else if(marks<=50&&marks >40) System.out.println("grade  is D");
  else if(marks<=40&&marks>30) System.out.println("grade is E");
  else System.out.println("grade is F");
    } 
    
}
