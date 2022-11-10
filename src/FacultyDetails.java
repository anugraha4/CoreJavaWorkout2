import java.util.Scanner;

class Faculty{
    int faculty_id;
    float salary1,salary2;


}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;
    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;
    }
    void display(){
        salary1=basic*allowance;
        System.out.println("Salary of FullTime Faculty: "+salary1);
    }
}
class PartTimeFaculty extends Faculty{
    float hour;
    float rate;
    PartTimeFaculty(float hour,float rate){
        this.hour=hour;
        this.rate=rate;
    }
    void display(){
        salary2=hour*rate;
        System.out.println("Salary of PartTime Faculty: "+salary2);
    }
}
class FacultyDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic and allowance of First FullTime Faculty");
        FullTimeFaculty f1=new FullTimeFaculty(sc.nextFloat(),sc.nextFloat());
        System.out.println("Enter basic and allowance of Second FullTime Faculty");
        FullTimeFaculty f2=new FullTimeFaculty(sc.nextFloat(), sc.nextFloat());
        System.out.println("Enter hour and rate of First PartTime Faculty");
        PartTimeFaculty p1=new PartTimeFaculty(sc.nextFloat(),sc.nextFloat());
        System.out.println("Enter hour and rate of second PartTime Faculty");
        PartTimeFaculty p2=new PartTimeFaculty(sc.nextFloat(),sc.nextFloat());
        System.out.println("Salary details of First and Second FullTime Faculty");
        f1.display();
        f2.display();
        System.out.println("Salary details of First and Second PartTime Faculty");
        p1.display();
        p2.display();
    }
}
