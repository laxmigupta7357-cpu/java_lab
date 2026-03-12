class Armstrong
{
    int num = 153;

    void check()
    {
        int temp = num;
        int sum = 0, rem;

        while(num > 0)
        {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if(temp == sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }

    public static void main(String[] args)
    {
        Armstrong a = new Armstrong();
        a.check();
    }
}