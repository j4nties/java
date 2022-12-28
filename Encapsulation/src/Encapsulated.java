public class Encapsulated 
{
    private String id = "221307102";
    private String name = "Acun Ilıcalı";
    private int age = 53;
    private String location ="Dominican Republic/Panama";

    private void getInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Location: "+location);
    }

    public void tryLoggin(String enteredNumber)
    {
        if (enteredNumber.equals(this.id))
        {
            getInfo();
        }
        else
        {
            System.out.println("Wrong id number!");
        }
    }
}



