import java .io.*;
class Lab4
{
    public static void main(String args[])throws IOException
    {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.print("Enter the limit: ");
        int limit = Integer.parseInt(obj.readLine());
        int array[] = new int[limit];
        System.out.println("Enter the elements");
        for(int i=0;i<limit;i++)
        {
            System.out.print("array["+i+"] = ");
            array[i] = Integer.parseInt(obj.readLine());
        }
        int largest = array[0];
        for(int i=0;i<limit;i++)
        {
            if(array[i]>largest)
            {
                largest = array[i];
            }
        }
        System.out.println("Largest number: "+largest);
    }
}
