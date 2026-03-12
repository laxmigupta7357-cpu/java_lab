class Calculator
{
    int a = 10;
    int b = 5;

    void addition()
    {
        System.out.println("Addition = " + (a + b));
    }

    void subtraction()
    {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiplication()
    {
        System.out.println("Multiplication = " + (a * b));
    }

    void division()
    {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args)
    {
        Calculator c = new Calculator();

        c.addition();
        c.subtraction();
        c.multiplication();
        c.division();
    }
}