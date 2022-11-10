import java.util.Scanner;

class OneBHK{
    double roomArea;
    double hallArea;
    double price;

    OneBHK(){
        roomArea=0;
        hallArea=0;
        price=0;
    }
    OneBHK(double roomArea,double hallArea, double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show(){
        System.out.println("\nRoomArea: "+roomArea+"\nHAllArea: "+hallArea+"\nPrice: "+price);
    }
}
class TwoBHK extends OneBHK{
    double room2Area;
    TwoBHK(){
        super();
    }

    TwoBHK(double roomArea,double hallArea,double price,double room2Area){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Room2Area: "+room2Area);
    }
}
class Flat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TwoBHK rm1=new TwoBHK(5,6,500,7);
        TwoBHK rm2=new TwoBHK(10,12,1000,14);
        TwoBHK rm3=new TwoBHK(15,18,1500,21);
        rm1.show();
        rm2.show();;
        rm3.show();
    }

}