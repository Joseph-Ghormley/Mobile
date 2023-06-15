/*
Made by Joseph Ghormley
 */


public class Main {
    public static void main(String[] args)
    {
        Mobile mobile1 = new Mobile("Nokia", "Win8", "Lumia", 10000);
        Mobile mobile2 = new Mobile("Nokia", "Win8");

        Android android1 = new Android("Samsung","Android", "Grand", 30000 );
        Android android2 = new Android("Samsung", "Android");

        BlackBerry blackBerry1 = new BlackBerry("BlackBerry", "RIM", "Curve", 20000);
        BlackBerry blackBerry2 = new BlackBerry("BlackBerry", "RIM");

        System.out.println(mobile1);
        System.out.println(mobile2);
        System.out.println(android1);
        System.out.println(android2);
        System.out.println(blackBerry1);
        System.out.println(blackBerry2);
    }
}
