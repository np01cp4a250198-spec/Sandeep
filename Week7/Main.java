package Week7;
public class Main
{
    public static void main(String []args)
    {
        // book objects
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.price = 550.50;
        Book book2 = new Book();
        book2.title = "Python Basics";
        book2.author = "Guido van Rossum";
        book2.price = 450.00;
        System.out.println("Book 1 Details:");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Price: Rs. " + book1.price);
        System.out.println();
        System.out.println("Book 2 Details:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Price: Rs. " + book2.price);
        
        // rectangleobjects
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        Rectangle r2 = new Rectangle();
        r2.length = 8;
        r2.breadth = 4;
        System.out.println("Rectangle 1 Details:");
        System.out.println("Length: " + r1.length);
        System.out.println("Breadth: " + r1.breadth);
        System.out.println("Area: " + (r1.length * r1.breadth));
        System.out.println();
        System.out.println("Rectangle 2 Details:");
        System.out.println("Length: " + r2.length);
        System.out.println("Breadth: " + r2.breadth);
        System.out.println("Area: " + (r2.length * r2.breadth));
        
        // employee objects
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Ram";
        e1.salary = 35000;
        Employee e2 = new Employee();
        e2.id = 102;
        e2.name = "Sita";
        e2.salary = 42000;
        Employee e3 = new Employee();
        e3.id = 103;
        e3.name = "Hari";
        e3.salary = 38000;
        System.out.println("Employee Details:");
        System.out.println("ID\tName\tSalary");
        System.out.println(e1.id + "\t" + e1.name + "\t" + e1.salary);
        System.out.println(e2.id + "\t" + e2.name + "\t" + e2.salary);
        System.out.println(e3.id + "\t" + e3.name + "\t" + e3.salary);
        Employee highest = e1;
        if (e2.salary > highest.salary)
        {
             highest = e2;
        }
         if (e3.salary > highest.salary)
         {
             highest = e3;
         }
        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("ID: " + highest.id);
        System.out.println("Name: " + highest.name);
        System.out.println("Salary: " + highest.salary);
        
        
        // laptop objects
        Laptop l1 = new Laptop("Dell", 8, 75000);
        Laptop l2 = new Laptop("HP", 16, 90000);
        Laptop l3 = new Laptop("Lenovo", 12, 85000);
        System.out.println("Laptops with RAM greater than 8GB:");
        System.out.println("Brand\tRAM\tPrice");
        if (l1.ram > 8)
        {
            System.out.println(l1.brand + "\t" + l1.ram + "\t" + l1.price);
        }
         if (l2.ram > 8)
         {
             System.out.println(l2.brand + "\t" + l2.ram + "\t" + l2.price);
             
         }
          if (l3.ram > 8)
          {
               System.out.println(l3.brand + "\t" + l3.ram + "\t" + l3.price);
          }
          
          
          
        // Mobile objects
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 18000;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 120000;

        Mobile m3 = new Mobile();
        m3.brand = "Redmi";
        m3.price = 15000;
        Mobile[] mobiles = {m1, m2, m3};
        System.out.println("Affordable Mobiles (Price < 20000):");
        for (Mobile m : mobiles)
        {
             if (m.isAffordable())
             {
                 System.out.println(m.brand + " - Rs. " + m.price);
             }
        }
        
        
        
        
        // result objects
        Result a2 = new Result();
        a2.subject1 = 65;
        a2.subject2 = 70;
        a2.subject3 = 85;
        Result b2 = new Result();
        b2.subject1 = 65;
        b2.subject2 = 70;
        b2.subject3 = 85;
        System.out.println("Result of Student 1:");
        a2.displayResult();
        System.out.println();
        System.out.println("Result of Student 2:");
        b2.displayResult();
          
          
          
         // Scenario objects
        BankAccount acc1 = new BankAccount(101, 5000);
        BankAccount acc2 = new BankAccount(102, 8000);
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc2.deposit(1000);
        acc2.withdraw(3000);
        System.out.println("Final Account Balances:");
        acc1.displayBalance();
        acc2.displayBalance();
        

        
    }   
    
    
    
}
