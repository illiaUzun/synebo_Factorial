package sample;

public class Factorial {

    public int factorial(int num) {

        int result = num;
        try {

            //Get the last digit from factorial calculation formula
            //7! = 1 * 2 * 3 * 4 * 5 * 6 * 7; 7 = (Result)
            for (int i = 1; result / i != 1; i++) {
                result = result / i;
            }

            //Check if the result is true (if this number can be factorial)
            if (num % result == 0)
                return result;
            else
                return -1;

        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean validation(int num) {
        if (num < 0) {
            return false;
        }
        return true;
    }
}
