import java.util.Scanner;

class Complex{

    void  sum(int r1,int i1,int r2,int i2){
        int rSum=r1+r2;
        int iSum=i1+i2;
        System.out.println("sum of("+r1+"+i"+i1+") and ("+r2+"+i"+i2+"): "+rSum+"+ i"+iSum);


    }
    void difference(int r1,int i1,int r2,int i2){
        int rDiff=r1-r2;
        int iDiff=i1-i2;
        System.out.println("sum of("+r1+"+i"+i1+") and ("+r2+"+i"+i2+"): "+rDiff+"+ i"+iDiff);


    }
    void product(int r1,int i1,int r2,int i2){
//        since we know that :=> (a + bi)*(c + di)
//                => a(c + di) + b*i(c + di)
//                => a*c + ad*i + b*c*i + b*d*i*i
//                => (a*c – b*d) + (a*d + b*c)*i

        int rProduct=(r1*r2-i1*i2);
        int iProduct=(r1*i2+i1*r2);
        System.out.println("sum of("+r1+"+i"+i1+") and ("+r2+"+i"+i2+"): "+rProduct+"+ i"+iProduct);

    }
}
public class solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex comp=new Complex();
        System.out.println("enter real part of first no.");
        int r1=sc.nextInt();
        System.out.println("enter imaginary part of first no.");
        int i1= sc.nextInt();
        System.out.println("enter real part of second no.");
        int r2=sc.nextInt();
        System.out.println("enter imaginary part of second no.");
        int i2=sc.nextInt();
        comp.sum(r1,i1,r2,i2);
        comp.difference(r1,i1,r2,i2);
        comp.product(r1,i1,r2,i2);

    }
}
