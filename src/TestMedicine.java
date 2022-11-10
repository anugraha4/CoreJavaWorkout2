class Medicine {
    public void displayLabel(){
        System.out.println("Company: Loyds Pharmaceutical");
        System.out.println("London");
    }
}
class Tablet extends Medicine{
    @Override
    public void displayLabel() {
        System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine{
    @Override
    public void displayLabel() {
        System.out.println("Shake well before use");
    }
}
class Ointment extends Medicine{
    @Override
    public void displayLabel() {
        System.out.println("For external use only");
    }
}
class TestMedicine{
    public static void main(String[] args) {
        Medicine m1=new Medicine();
        Medicine m2=new Medicine();
        Medicine m3=new Medicine();
        double i=Math.random()*4;
        int j=(int)i;
        System.out.println(j);

        switch (j)
        {
            case 1:
                Medicine t=new Tablet();
                m1.displayLabel();
                System.out.println("For Tablet");
                t.displayLabel();
                break;

            case 2:
                Medicine s=new Syrup();
                m2.displayLabel();
                System.out.println("For Syrup");
                s.displayLabel();
                break;


            case 3:
                Medicine o=new Ointment();
                m3.displayLabel();
                System.out.println("For Ointment");
                o.displayLabel();
                break;


            default:System.out.println("Invalid Choice");
        }
    }
}