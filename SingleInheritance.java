class A
{
    void show()
    {
        System.out.println("This is Parent class");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("This is Child class");
    }
}

class SingleInheritance
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
        obj.display();
    }
}