import java.util.Scanner;

class Tile{
    int edge;
    int area;
    Tile(int edge){
        this.edge=edge;
        this.area=edge*edge;
    }
    int tileArea(){
        return area;
    }
}
class Floor{
    int length;
    int width;
    Floor(int l,int w){
        this.length=l;
        this.width=w;


    }
    void totalTiles(Tile t){
        int tileArea=t.tileArea();
        int floorArea=length*width;
        int noOfTiles=floorArea/tileArea;
        System.out.println("Total no.of tiles needed to cover thr floor completely:"+noOfTiles);

    }
}
public class TileClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of tile:");
        Tile t=new Tile(sc.nextInt());
        System.out.println("Enter length and width of floor:");
        Floor f=new Floor(sc.nextInt(), sc.nextInt());
        f.totalTiles(t);

    }
}
