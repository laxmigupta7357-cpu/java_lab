class Palindrome
{
    int num = 121;

    void check()
    {
        int temp = num;
        int rev = 0, rem;

        while(num > 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(temp == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

    public static void main(String[] args)
    {
        Palindrome p = new Palindrome();
        p.check();
    }
}