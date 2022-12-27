import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        // with classic array first you need to give a specific index 
        String[] fruits = new String[3];
        // and then you can add items into your array
        for (String fruit : fruits) {
            
            System.out.println("Enter a fruit name(array): ");
            String fruitName = input.nextLine();
            fruit = fruitName;
        }

        // creating our array list arraylists have their special methods which make things easier
        ArrayList<String> fruitList = new ArrayList<>();
        //with arraylist you don't need to specify index of array
        for (int i = 0; i < 5; i++)// i made a loop so our array is going to have 5 item
        {
            System.out.println((i+1)+") Enter a fruit name(arraylist): ");
            String fruitName = input.nextLine();
            fruitList.add(fruitName);
        }

        System.out.println("Normal => "+fruitList); // we can print our arraylist and add items :D flexible
        fruitList.remove(0);
        System.out.println("Removed last item => "+fruitList);
    }
}
