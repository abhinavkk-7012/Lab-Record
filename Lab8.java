import java.io.*;
class Lab8
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.print("Enter a string: ");
        String str = obj.readLine();
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println(str + " is a palindrome. ");
        }
        else
        {
            System.out.println(str + " is not a palindrome. ");
        }
    }
}