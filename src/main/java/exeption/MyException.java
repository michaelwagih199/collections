package exeption;

public class MyException {
    public static void main(String[] args) {
        int a=4;
        while(a>0)
        {
            System.out.print(a + " ");
            a--;
        }
    }

    static double divider(int x, int y) throws ArithmeticException {
        return x/y;
    }

}
