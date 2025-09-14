import java.io.*;
class Lab9
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.print("Enter the Limit: ");
        int limit = Integer.parseInt(obj.readLine());
        int[] array = new int[limit];
        System.out.println("Enter the elements.");
        for(int i = 0; i < limit; i++)
        {
            array[i] = Integer.parseInt(obj.readLine());
        }
        System.out.println("Reverse order:");
        for(int i = limit - 1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
    }
}