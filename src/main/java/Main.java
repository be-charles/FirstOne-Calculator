public class Main {

    String name;

    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int divide(int x, int y){
        return x / y;
    }

    public int multiple(int x, int y){
        return x * y;
    }

    public double modulus(double x, double y){ return x % y; }

    public static void main(String[] args) {
        // write your code here

        Main calc = new Main();

        calc.name = "The total price is ";

        System.out.println(calc.name + "R" + calc.add(4,2) + ".00");
        System.out.println(calc.name + "R" +  calc.divide(6,3)+".00");
        System.out.println(calc.name + "R" +  calc.multiple(2,2)+".00");
        System.out.println(calc.name + "R" +  calc.subtract(5,4)+".00");
        System.out.println("2 modulus 10 = " + calc.modulus(2, 10));
    }
}
