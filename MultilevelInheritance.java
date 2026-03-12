class A
{
    void show()
    {
        System.out.println("Class A");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("Class B");
    }
}

class C extends B
{
    void print()
    {
        System.out.println("Class C");
    }
}

class MultilevelInheritance
{
    public static void main(String args[])
    {
        C obj = new C();
        obj.show();
        obj.display();
        obj.print();
    }
}