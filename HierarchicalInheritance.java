class A
{
    void show()
    {
        System.out.println("Parent class");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("Child class B");
    }
}

class C extends A
{
    void print()
    {
        System.out.println("Child class C");
    }
}

class HierarchicalInheritance
{
    public static void main(String args[])
    {
        B obj1 = new B();
        C obj2 = new C();

        obj1.show();
        obj1.display();

        obj2.show();
        obj2.print();
    }
}