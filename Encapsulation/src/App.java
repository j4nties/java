import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id number: ");
        String id = input.nextLine();
        Encapsulated user = new Encapsulated();
        user.tryLoggin(id);//trylogin gives chance to access private informations
        //user.name can't accessible because it's private 
    }
}


















