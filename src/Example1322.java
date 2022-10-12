import java.util.Scanner;
public class Example1322 {
    public static void main(String[] argv) {
        float number1;
        float number2;
        float number3;
        float biggest;
        biggest=0;

        System.out.println("Enter the number1:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number1 = inputValue.nextFloat();
        System.out.println("Enter the number2:");
        number2 = inputValue.nextFloat();
        System.out.println("Enter the number3:");
        number3 = inputValue.nextFloat();
        if (number1 >= number2) {
            if (number2 >= number3) {
                biggest = number1;

            } else {
                if (number1 >= number3) {
                    biggest = number1;

                } else {
                    biggest = number3;

                }
            }
        } else if (number2 >= number3) {
            biggest = number2;

        } else {
            biggest = number3;

        }

        System.out.println("The biggest is: " + biggest);
    }

}
