package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double num = 1.5;
        printNumber((int)num);
    }

    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }
}
