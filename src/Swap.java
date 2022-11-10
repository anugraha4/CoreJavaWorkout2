import java.util.Scanner;

public class Swap {
    int a,b;

    void callByValue(int a,int b){
        int temp;
        System.out.println("Before swap: \n"+a+"\n"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: \n"+a+"\n"+b);

    }
    void callByReference(Swap s){
        int temp;
        System.out.println("Before swap: \n"+s.a+"\n"+s.b);
        temp=s.a;
        s.a=s.b;
        s.b=temp;
        System.out.println("After swapping:\n"+s.a+"\n"+s.b);



    }

    public static void main(String[] args) {
        Swap s=new Swap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for call by value");
        s.callByValue(sc.nextInt(), sc.nextInt());
        System.out.println("Enter values for call by reference");
        s.a=sc.nextInt();
        s.b= sc.nextInt();
        s.callByReference(s);
    }
}
