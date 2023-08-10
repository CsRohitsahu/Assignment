class Triangle{
    public float area(float l,float b,float h){
        return (b*h)/2;

    }
    public float perimeter(float l,float b,float h){
        return (l+b+h);
    }
}
public class solution2 {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        float l=3f;
        float b=32f;
        float h=3f;
        System.out.println("area of triangle is "+t.area(l,b,h));
        System.out.println("perimeter of triangle is"+t.perimeter(l,b,h));


    }
}
