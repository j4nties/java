public class App {
    public static void main(String[] args)
    {
        Printer<String> Str = new Printer<>();
        Printer<Integer> Int = new Printer<>();
        Printer<Float> Float = new Printer<>();
        Printer<Double> Double = new Printer<>();
        Printer<Boolean> Bool = new Printer<>();
        //!========================================
        Str.print("Janties");
        Int.print(21);
        Float.print(12.34f);
        Double.print(34.56);
        Bool.print(true);
    }
}