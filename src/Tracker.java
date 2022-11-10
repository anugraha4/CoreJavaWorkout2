public class Tracker {
    public static int t;
    Tracker(){
        t++;
    }

    public static void main(String[] args) {
        Tracker a1,a2;
        a1=new Tracker();
        a2=new Tracker();
        a1=null;
        a2=a1;
        System.gc();
        System.out.println(t);
    }

    protected void finalize(){
        t--;
        System.out.println("Garbage value"+this);
        System.out.println(t);
    }
}
