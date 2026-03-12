class Fibonacci
{
    int n = 10;

    void printSeries()
    {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for(int i = 2; i < n; i++)
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args)
    {
        Fibonacci f = new Fibonacci();
        f.printSeries();
    }
}