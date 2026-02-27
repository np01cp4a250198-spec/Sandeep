package Week12;
import java.util.ArrayList;
import java.util.Iterator;

public class Arr
{
    public static void main(String[] agrs)
    {
        ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.println(arraylist.isEmpty());
        
        arraylist.add(45);
        arraylist.add(50);
        arraylist.add(40);
        System.out.println(arraylist);
        arraylist.add(1,100);
        System.out.println(arraylist);
        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.size());
        
        //remove, access and update
        
        arraylist.remove(0);
        System.out.println(arraylist);
        
        System.out.println(arraylist.get(0));
        arraylist.set(0, 87);
        System.out.println(arraylist);
        
        
        // contains, indexof
        System.out.println(arraylist.contains(27));
        System.out.println(arraylist.indexOf(20));
        
        
        
        // traversing an arraylist elements
        
        for(int arr: arraylist)
        {
            System.out.println(arr);
        }
        //Iterator inerface
        
        
        Iterator<Integer> itr = arraylist.iterator();
        while(itr.hasNext())
        {
            int marks = itr.next();
            System.out.println(marks);
        }
        
        
        
        
        
        
        
        
        
    }
}