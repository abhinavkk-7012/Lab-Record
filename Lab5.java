import java.io.*;
class FibAndFact
{
    int recursivefact(int n)
        {
        if (n <= 1)
            return 1;
        return (n * recursivefact(n - 1));
        }
    int nonrecursivefact(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    int recursivefib(int n)
    {
        if (n <= 1)
            return n;
        return (recursivefib(n - 1) + recursivefib(n - 2));
    }
    void printRecursiveFibSeries(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(recursivefib(i) + " ");
        }
    }
    void nonrecursivefib(int n)
    {
     int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1)
        {
            System.out.print(b + " ");
        }
        for (int i = 2; i < n; i++)
        {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
class Lab5
{
    public static void main(String args[]) throws IOException
    {
        FibAndFact obj1 = new FibAndFact();
        DataInputStream obj2 = new DataInputStream(System.in);
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(obj2.readLine());
        System.out.println("Factorial of the number using Recursive and non Recursive function.");
        System.out.println("Recursive: "+obj1.recursivefact(n));
        System.out.println("Non-Recursive: "+obj1.nonrecursivefact(n));
        System.out.println("Fibonacci series up to the number using Recursive and non Recursive function");
        System.out.print("Recursive: ");
        obj1.printRecursiveFibSeries(n);
        System.out.println();
        System.out.print("Non-Recursive: ");
        obj1.nonrecursivefib(n);
        System.out.println();
    }
}
