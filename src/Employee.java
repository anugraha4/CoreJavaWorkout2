import java.util.Scanner;

public class Employee {
    Scanner sc=new Scanner(System.in);
    String Name,EmpID,result;
    int a1,a2,a3;

    void getData(){
        System.out.println("Enter name");
        Name = sc.next();
        System.out.println("Enter employee ID");
        EmpID=sc.next();
        System.out.println("Enter assessment score");
        a1= sc.nextInt();
        a2= sc.nextInt();
        a3=sc.nextInt();
    }
    void showData(){
        System.out.println("Employee ID: "+EmpID);
        System.out.println("Name: "+Name);
        if(a1>=75 && a2>=75 && a3>=75)
        {
            result="Promoted";

        }
        else {
            result="Demoted";
        }
        System.out.println("Result: "+result);
        int total= a1+a2+a3;
        float p=(float) ((total*100)/300);
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+p);

    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.getData();
        e.showData();
    }
}
