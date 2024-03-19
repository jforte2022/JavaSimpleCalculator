import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number1 = 0;
    int number2 = 0;
    int operator = 0;
    System.out.print("Please enter a number: ");
    number1 = input.nextInt();
    System.out.print("Please enter another number: ");
    number2 = input.nextInt();
    System.out.print("What operation do you wish to perform? (addition = 1, subtraction = 2, "
            + "multiplication = 3, division = 4, modulo = 5): ");
    operator = input.nextInt();
    switch(operator){
        case 1:
            System.out.println("The addition of your numbers equals " + (number1 + number2));
            break;
        case 2:
            System.out.println("The subtraction of your numbers equals " + (number1 - number2));
            break;
        case 3:
            System.out.println("The multiplication of your numbers equals " + (number1 * number2));
            break;
        case 4:
            System.out.println("The division of your numbers equals " + (number1 / number2));
            break;
        case 5:
            System.out.println("The remainder of the division of your numbers equals " + (number1 % number2));
            break;
        default:
            System.out.println("You have not entered a possible operation!");
            break;
    }
    }
}