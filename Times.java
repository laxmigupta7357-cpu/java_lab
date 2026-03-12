class Times
{
    int hr;
    int min;
    int sec;

    void add()
    {
        int h1 = 2, m1 = 45, s1 = 50;
        int h2 = 3, m2 = 20, s2 = 50;

        hr = h1 + h2;
        min = m1 + m2;
        sec = s1 + s2;

        // convert seconds to minutes
        min = min + (sec / 60);
        sec = sec % 60;

        // convert minutes to hours
        hr = hr + (min / 60);
        min = min % 60;

        System.out.println("Total Time = " + hr + " hr " + min + " min " + sec + " sec");
    }

    public static void main(String[] args)
    {
        Times t = new Times();
        t.add();
    }
}