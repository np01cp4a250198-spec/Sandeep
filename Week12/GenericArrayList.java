package Week12;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayList
{
    public static void main(String[] args)
    {
       ArrayList<String> names = new ArrayList<>();
       ArrayList<Integer> numbers = new ArrayList<>();
       names.add("Sandeep");
       names.add("Ramesh");
       names.add("Anita");
       names.add("Kiran");
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       numbers.add(40);
       numbers.add(50);
       for (Integer num : numbers)
       {
           System.out.println(num);
       }
       for (String name : names)
       {
           System.out.println(name);
       }
       Iterator<Integer> numIterator = numbers.iterator();
       while (numIterator.hasNext())
       {
           System.out.println(numIterator.next());
       }
       Iterator<String> nameIterator = names.iterator();
       while (nameIterator.hasNext())
       {
           System.out.println(nameIterator.next());
       }
       names.remove(2);
       System.out.println(names);
       System.out.println(names.size());
       numbers.clear();
       System.out.println(names.get(1));
       System.out.println(names.get(2));


       
       
    }
}