public class MathFunction {
    int multiply(int a,int b){
        return a*b;
    }
    float multiply(float a,float b){
        return a*b;
    }
    float multiply(int a,float b){
        return a*b;
    }

    public static void main(String[] args) {
        MathFunction m=new MathFunction();
        System.out.println(m.multiply(4,4));
        System.out.println(m.multiply(4.1f,2.2f));
        System.out.println(m.multiply(3,2.4f));
    }
}
