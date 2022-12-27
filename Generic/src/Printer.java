public class Printer <T>
{
    T thingToPrint;
    
    public Printer(T thingToPrint)//constructor
    {
        this.thingToPrint = thingToPrint;
    }

    public void print()
    {
        System.out.println(thingToPrint);
    }
}
