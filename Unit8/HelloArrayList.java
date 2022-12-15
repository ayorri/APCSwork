import java.util.*;


public class HelloArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Gizmo");
        names.add("Gadget");
        names.add("Tux");

        System.out.println("first: " + names.get(0));

        System.out.println("names: " + names.size());

        for (int i=0; i<names.size(); i++)
        {
            String name = names.get(i);
            System.out.print(name + " ");
        }

        System.out.println();

        for (String name : names)
            System.out.print(name + " ");

        System.out.println();

        System.out.println("removing item 1");
        names.remove(1);

        System.out.println("names: " + names.size());
        for (String name : names)
            System.out.print(name + " ");
        System.out.println();

        // auto-boxing

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("numbers: " );

        for (int value : numbers)
            System.out.println(value);

    }
}
