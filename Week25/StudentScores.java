package Week25;

import java.util.HashMap;

public class StudentScores {
    public static void main(String[] args) {

    
        HashMap<Integer, Integer> students = new HashMap<>();

       
        students.put(101, 85);
        students.put(102, 92);
        students.put(103, 78);

        students.put(102, 95);

   
        students.remove(101);

     
        if (students.containsKey(103)) {
            System.out.println("ID 103 Score: " + students.get(103));
        }

     
        System.out.println("\nAll Students:");
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + " | Score: " + students.get(id));
        }
    }
}
