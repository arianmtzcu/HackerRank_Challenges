package g_avanced;


class SingletonPattern{

    public String str;
    private static SingletonPattern single_instance = null;

    private SingletonPattern() {
        str = "Hello I am a singleton! Let me say hello world to you";
    }

    public static SingletonPattern getSingleInstance() {
        if (single_instance == null)
            single_instance = new SingletonPattern();
        return single_instance;
    }
}


/*
class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    public static Singleton getSingleInstance()  {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}

class SingletonPattern{

    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}

*/