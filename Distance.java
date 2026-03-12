class Distance
{
    int meter;
    int cm;
    int mm;

    void add()
    {
        int m1 = 2, c1 = 50, mm1 = 30;
        int m2 = 3, c2 = 70, mm2 = 80;

        meter = m1 + m2;
        cm = c1 + c2;
        mm = mm1 + mm2;

        // convert mm to cm
        cm = cm + (mm / 10);
        mm = mm % 10;

        // convert cm to meter
        meter = meter + (cm / 100);
        cm = cm % 100;

        System.out.println("Total Distance = " + meter + " m " + cm + " cm " + mm + " mm");
    }

    public static void main(String[] args)
    {
        Distance d = new Distance();
        d.add();
    }
}