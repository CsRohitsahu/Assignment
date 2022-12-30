import java.util.Scanner;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // taking 2 integer valur in two variables x and y and print their product
        System.out.println("Enter value of x");
        int x=sc.nextInt();
        System.out.println("Enter value of y");
        int y =sc.nextInt();
        int p=x*y;
        System.out.println("product of "+x+" and "+ y +" is "+p);
        //Q2 print the ASCII value of charater 'u'
        int a='U';
        System.out.println("Ascii value of U is "+a);
        //Q3 printing area of rectangle 
        System.out.println("Enter length and bridth of rectangle");
        int ln=sc.nextInt();
        int br=sc.nextInt();
        System.out.println("area of rectangle is "+ln*br);
        //q3 calculating cube of a number
        System.out.println("enter no:");
        int n=sc.nextInt();
        System.out.println("cube of "+n+" is "+n*n*n);
        //Q5 swaping number using third variable
        int n1,n2;
        n1=3;
        n2=8;
        int temp;
        temp =n1;
        n1=n2;
        n2=temp;
        System.out.println("n1= "+n1+" n2=" +n2);


    }
}