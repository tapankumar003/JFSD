public class MathOp {

    int addition(int a, int b){
        return a+b;
    }

    int substraction(int a, int b){
        return a-b;
    }
    int multiplication(int a, int b){
        return a*b;
    }
    int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        MathOp m = new MathOp();
        int a = 10;
        int b = 5;
        System.out.println(a+"+"+b+" = "+m.addition(a, b));
        System.out.println(a+"-"+b+" = "+m.substraction(a, b));
        System.out.println(a+"*"+b+" = "+m.multiplication(a, b));
        System.out.println(a+"/"+b+" = "+m.division(a, b));
    }
}
