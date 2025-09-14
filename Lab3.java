class Lab3
{
    public static void main(String arg[])
    {
        if(arg.length != 0)
        {
            String name = arg[0];
            String surname = arg[1];
            System.out.println("Welcome "+name+" "+surname+"!");
        }
        else
        {
            System.out.println("Enter the name and surname as command line arguments.");
        }
    }
}