class Distances
{
    int meter;
    int cm;

    void add()
    {
        int m1 = 4, c1 = 80;
        int m2 = 3, c2 = 50;

        meter = m1 + m2;
        cm = c1 + c2;

        // convert cm to meter
        meter = meter + (cm / 100);
        cm = cm % 100;

        System.out.println("Total Distance = " + meter + " meter " + cm + " cm");
    }

    public static void main(String[] args)
    {
        Distances d = new Distances();
        d.add();
    }
}