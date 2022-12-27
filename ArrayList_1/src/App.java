import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);// Scanner object named input
        ArrayList<Double> numberList = new ArrayList<>();// ArrayList object named numberList
        
        double number;  // that will store user inputs
        char operator;

        do // loop that continue until user enter 0
        {
            System.out.println("Enter a number: ");
            number = input.nextDouble();
            numberList.add(number); 
        } while( number != 0);
        //remove last item 0 from our arraylist
        numberList.remove(0.0);// if you enter a integer into remove() it removes the item in the index that you specified
        System.out.println("Entered numbers => " + numberList);// printing arraylist
        System.out.println("Choose an operator( *, +): ");
        operator = input.next().charAt(0);
        switch (operator) {
            case '*':
                multiply(numberList);
                break;
            case '+':
                sum(numberList);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        
    }

    public static void multiply(ArrayList<Double> list)
    {
        double result = 1;
        for (var number : list) {
            result *= number;
        }
        System.out.println("Result: "+result);
    }
    public static void sum(ArrayList<Double> list)
    {
        double result = 0;
        for (var number : list) {
            result += number;
        }
        System.out.println("Result: "+result);
    }
}
