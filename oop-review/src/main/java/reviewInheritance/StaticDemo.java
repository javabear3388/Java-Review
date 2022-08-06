package reviewInheritance;

public class StaticDemo {

    public static void main(String[] args) {
        System.out.println(Order.result +""); //ur
        System.out.println(Order.result +""); //ur

        new Order(); //urc
        new Order(); //urcc

        System.out.println(Order.result +""); //urcc

    }
}

class Order{
    static String result = "";

    {result += "c";}
    static { result += "u";}
    static { result += "r";}
}
