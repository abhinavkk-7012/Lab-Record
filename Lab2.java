class Lab2
{
    public static void main(String args[])
    {
        if(args.length != 0)
        {
            int num = Integer.parseInt(args[0]);
            int square = num * num;
            System.out.println("Square of "+num+" is "+square);
        }
        else
        {
            System.out.println("Please provide a number as a command line!.");
        }
    }
}