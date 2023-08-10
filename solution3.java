class Area{
    float length;
    float width;
    Area(float length,float width){
        this.length=length;
        this.width=width;
    }

    float returnArea(){
       return  (length*width)/2;
    }
}
public class solution3 {
    public static void main(String[] args) {
        Area a=new Area(4,6);
        System.out.println("area of triangle is: "+a.returnArea());


    }
}
