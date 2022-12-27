public class App {
    public static void main(String[] args){
        
        Printer<Integer> printer = new Printer<>(2023); // <Integer> i want printer for integers
        printer.print();
        Printer<String> printer2 = new Printer<>("j4nties");
        printer2.print();
    }
}
