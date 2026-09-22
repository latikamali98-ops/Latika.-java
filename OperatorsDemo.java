public class OperatorsDemo {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    int multiply(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        int x = 5, y=3;
        System.out.println("x +  y=" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" +(x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));

        byte a = 10, b = 30;
        int result = a + b;
        System.out.println("Arithmetic promotion Result: " + result);

        OperatorsDemo obj = new OperatorsDemo();
        obj.add(5, 7);
        int product = obj.multiply(4, 5);
        System.out.println("Multiplication: " + product);
    }
}