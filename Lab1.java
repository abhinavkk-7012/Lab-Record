import java.io.*;
class Lab1
{
    public static void main(String args[])throws IOException
    {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = Integer.parseInt(obj.readLine());
        int num2 = Integer.parseInt(obj.readLine());
        int product = num1 * num2;
        System.out.println("Product : "+product);
    }
}