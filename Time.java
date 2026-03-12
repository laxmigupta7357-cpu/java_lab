class Time
{
    int hr;
    int min;

    void add()
    {
        int h1 = 3, m1 = 45;
        int h2 = 2, m2 = 30;

        hr = h1 + h2;
        min = m1 + m2;

        // convert minutes to hours
        hr = hr + (min / 60);
        min = min % 60;

        System.out.println("Total Time = " + hr + " hr " + min + " min");
    }

    public static void main(String[] args)
    {
        Time t = new Time();
        t.add();
    }
}