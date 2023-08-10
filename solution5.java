class Employee{
    String name;
    int yearOfJoining;
    float salary;
    String address;
    Employee(String name,int yearOfJoining,float salary,String address){
        this.name=name;
        this.yearOfJoining=yearOfJoining;
        this.salary=salary;
        this.address=address;
    }
    void printInformation(){
        System.out.println("name is:"+this.name+"\nyear of joining is:"+this.yearOfJoining+"\nsalary is:"+this.salary+"\naddress is:"+this.address);
    }
}
public class solution5 {
    public static void main(String[] args) {
        Employee Robert=new Employee("Robert",2010,100000,"delhi");
        Robert.printInformation();
        Employee Sam=new Employee("Sam",2018,120000,"noida");
        Sam.printInformation();
        Employee John=new Employee("John",2023,200000,"Bengluru");
        John.printInformation();
    }
}
