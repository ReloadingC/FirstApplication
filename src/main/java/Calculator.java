public class Calculator {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        String  op = args[1] ;

        int result = calculate(num1,op,num2);

        System.out.println("Result: " + result );


    }

    private static int calculate(int num1, String op, int num2) {
        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ділення на нуль неможливе.");
                }
                break;
        }
        return result;
    }


}

