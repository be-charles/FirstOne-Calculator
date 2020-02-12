package first;
// Name and student number: Rachael Klein : 218 057 377
// Date : 2020/02/12

public class main {

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


        public static void main(String[] args) {
            // write your code here

            main calc = new main();

            calc.name = "The total price is ";

            System.out.println(calc.name + "R" + calc.add(4,2) + ".00");
            System.out.println(calc.name + "R" +  calc.divide(6,3)+".00");
            System.out.println(calc.name + "R" +  calc.multiple(2,2)+".00");
            System.out.println(calc.name + "R" +  calc.subtract(5,4)+".00");

        }



}
