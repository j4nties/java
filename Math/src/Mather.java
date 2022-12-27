public class Mather
{
    //static sum
    public static void Sum(int... numbers)
    {
        int sum = 0;
        for (int number : numbers) 
        {
            sum += number;
        }
        System.out.println("Sum => "+sum);
    }
    //static sub
    public static void Subtract(int... numbers)
    {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) 
        {
            if(i == 0){sum = numbers[i];}
            else{sum -= numbers[i];}
        }
        System.out.println("Subtract => "+sum);
    }
    //static multiply
    public static void Multiply(int... numbers)
    {
        int sum = 1;
        for (int number : numbers) 
        {
            sum *= number;
        }
        System.out.println("Multiply => "+sum);
    }
    //static average
    public static void Average(int... numbers)
    {
        int sum = 0;
        for (int number : numbers) 
        {
            sum += number;
        }
        sum /= numbers.length;
        System.out.println("Average => "+sum);
    }
}
