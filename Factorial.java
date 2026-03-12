class Factorial
{
    int num = 5;
    int fact = 1;

    void calculate()
    {
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }

    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        f.calculate();
    }
}