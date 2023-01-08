import java.util.Scanner;
public class Recursion31{
    static int pow(int n,int digit){
        if(digit==0) return 1;
        if(digit%2==0) return pow(n,digit/2)*pow(n,digit/2);
        else return pow(n,digit/2)*pow(n,digit/2)*n;
    }
    static int armstrong(int n,int digit){
        if(n==0) return 0;
        return armstrong(n/10, digit)+pow(n%10,digit);
    }
    // for finding product
    static int product(int n1,int n2){
        if(n1<n2) return product(n2,n1);
        else if(n2!=0) return n1+product(n1, n2-1);
        else return 0;
    }
    // for finding prime no.
    static boolean isPrime(int n,int i){
        if(n<=2) return (n==2)?true:false;
        if(n%i==0) return false;
        if(i*i>n) return true;
       return isPrime(n,i+1);
    }

    // finding binary no.
    static int binary(int n){
        if(n==0) return 0;
        else{
            return (n%2+10*binary(n/2));
        }
    }
//binary code to gray code 
public static int binary_to_gray(int n, int i) {
    int a, b;
    int result = 0;
    if (n != 0) {
            // Taking last digit
            a = n % 10;
            n = n / 10;
            // Taking second last digit
            b = n % 10;
            if ((a & ~b) == 1 || (~a & b) == 1) {
                    result = (int)(result + Math.pow(10, i));
            }
            return binary_to_gray(n, ++i) + result;
    }
    return 0;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /*  System.out.println("enter no. of element you want to check: ");

        int n=sc.nextInt();
      
        int arr[]=new int[n]; 
        System.out.println("Enter element in array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int digit=0;

        int temp=arr[i];
        while(arr[i]>0){
            arr[i]/=10;
            digit++;
        }
        if(temp==armstrong(temp,digit))
        System.out.println(temp+" is armstrong no.");
        else System.out.println(temp+" is not armstrong no.");
    }*/

    //Q2 find producut of two number using recursion
    /*System.out.println("enter first no.");
    int n1=sc.nextInt();
    System.out.println("enter second no.");
    int n2=sc.nextInt();
    System.out.println("product of "+n1+" and "+n2+" is "+product(n1,n2));*/

    //q3  checking prime no. using recursion
    /*System.out.println("enter no. you want to check prime or not ");
    int n=sc.nextInt();
    if(isPrime(n,2)) System.out.println(n+" is prime no.");
    else System.out.println(n+" is not prime no.");*/

    //Q4 decimal to binary no.

    /*System.out.println("enter decimal no.");
    int n=sc.nextInt();
    System.out.println("binary of "+n+" is "+binary(n));*/

    System.out.println("enter binary no.");
    int n=sc.nextInt();
    System.out.println("gray code of "+n+" is "+binary_to_gray(n, 0));
        
    }
}