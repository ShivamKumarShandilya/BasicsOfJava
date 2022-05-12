import java.util.*;
class Student
{
    String Name;
    int age;
    char Section;
    int Percentage;
    Student(String Name,int age,char Section,int percentage)
    {
        this.roll=roll;
        this.age=age;
        this.Section=section;
        this.Percentage=Percentage;
    }
    public static void main()
    {
            String Name;
            int age;
            char Section;
            int Percentage;
            int total;
            int perc;
        Scanner sc = new Scanner(system.in);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter section:");
        section = sc.nextLine();
        System.out.println("Enter Percentage:");
        percentage = sc.nextInt();
        Student a1 = new Student(Name, age, section,Percentage);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter section:");
        section = sc.nextLine();
        System.out.println("Enter Percentage:");
        percentage = sc.nextInt();
        Student a2 = new Student(Name, age, section,Percentage);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter section:");
        section = sc.nextLine();
        System.out.println("Enter Percentage:");
        percentage = sc.nextInt();
        Student a3 = new Student(Name, age, section,Percentage);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter section:");
        section = sc.nextLine();
        System.out.println("Enter Percentage:");
        percentage = sc.nextInt();
        Student a4 = new Student(Name, age, section,Percentage);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter section:");
        section = sc.nextLine();
        System.out.println("Enter Percentage:");
        percentage = sc.nextInt();
        Student a5 = new Student(Name, age, section,Percentage);
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter section:");
        section = sc.nextLine();
        System.out.println("Enter Percentage:");
        percentage = sc.nextInt();
        Student a6 = new Student(Name, age, section,Percentage);
        total = a1.Percentage+a2.Percentage+a3.Percentage+a4.Percentage+a5.Percentage+a6.Percentage;
        perc = total/6;
        System.out.println("Total average is: %d",perc);
    }
        
    }
}
