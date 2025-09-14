import java.io.*;
class Lab7
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.print("Enter the limit: ");
        int limit= Integer.parseInt(obj.readLine());
        String[] str = new String[limit];
        System.out.println("Enter the names");
        for(int i = 0;i < limit; i++)
        {
            str[i] = obj.readLine();
        }    
        for(int i=0;i<limit - 1;i++)
        {
            for(int j=i + 1;j<limit;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Names In Ascending Order.");
        for(int i=0;i < limit;i++)
        {
            System.out.println(str[i]);
        }
    }
}