package classpart;

public class FunctionTest {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2);
        int min = minus(num1, num2);
        int sup = supply(num1, num2);
        int div = divide(num1, num2);

        System.out.println(num1 + "+" + num2 + " = " + sum + "입니다");
        System.out.println(num1 + "-" + num2 + " = " + min + "입니다");
        System.out.println(num1 + "*" + num2 + " = " + sup + "입니다");
        System.out.println(num1 + "/" + num2 + " = " + div + "입니다");
    }

    public static int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public static int minus(int n1, int n2){
        int result = n1 - n2;
        return result;
    }

    public static int supply(int n1, int n2){
        int result = n1 * n2;
        return result;
    }

    public static int divide(int n1, int n2){
        int result = n1 / n2;
        return result;
    }
}
