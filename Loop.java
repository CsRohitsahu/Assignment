import java.util.Scanner;

public class Loop {
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
       /*  System.out.println("enter no. you want to print fibonacci series ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
   System.out.print("1 ");
        while(n>1){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }*/

        //Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
        //negative or zero. Calculate the sum of numbers until a negative number is encountered.
         //If the input is a negative number, current sum is discarded and print -1.
         /*int sum=0;
         System.out.println("Do you want to enter no.");
       char c=sc.next().charAt(0);
       while(c=='y'){
        System.out.println("enter no.");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Do you want to enter no.:");
        c=sc.next().charAt(0);
        }
        if(n>=0) sum+=n;
        else {
            System.out.println("-1");
            sum=0;
            c='n';
        }
     
        
       }

       System.out.println("sum is "+sum);*/
       //Q3 Write a program to calculate the factorial of a number.
       /*System.out.println("enter no. you want to calculate factorial");
       int n=sc.nextInt();
       int fact=1;
       int i=1;
       while(n>0){
        fact*=i;
        i++;
        n--;

       }
      System.out.println("factoiral is "+fact);*/

      // Q4- Write a program to print all Armstrong numbers between 1 to n.
      
      /*System.out.print("enter limit at which you want to find armstrong no.");
      int limit=sc.nextInt();
      for(int i = 1; i <=limit; i++)
      {
          int n,b,result=0,digit=0;
          n = i;
          int temp=i;
          while(temp!=0){
              temp/=10;
              digit++;
          }


          while(n > 0)
          {
              b = n % 10;
              result+= (int)Math.pow(b,digit);
              n = n / 10;

          }
          if(result == i)
          {
              System.out.print(i+" ");
          }

      }*/

      // pattern printing 
/*System.out.println("enter size :");
      int size = 5; 
      for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
      if(i == j || i+j == size-1){
    
      System.out.print("*");
      }else{
      System.out.print(" ");
      }
      }
      System.out.println();
    }*/

    int size = 5; 
int alpha = 65; 
int num = 0; 
for (int i = 1; i <= size; i++) {
for (int j = size; j > i; j--) {
System.out.print(" ");
}
for (int k = 0; k < i * 2 - 1; k++) {
System.out.print((char)(alpha+num++));
}
num = 0;
System.out.println();
}
for (int i = 1; i <= size - 1; i++) {
for (int j = 0; j < i; j++) { 
System.out.print(" ");
}
for (int k = (size - i) * 2 - 1; k > 0; k--) {
System.out.print((char)(alpha+num++));
}
num = 0;
System.out.println();
}

    }
}      


    
    

