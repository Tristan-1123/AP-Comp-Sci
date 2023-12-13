package Q2.StudentDB;
import java.util.*;
public class StudentDatabase {
    public static int indexOfStu(ArrayList<Student> db, int id){
        int index = -1;
        for (int lcv = 0; lcv< db.size(); lcv++){
            if (db.get(lcv).getId()==id) index = lcv;
        }
        return index;
    }

    public static int indexOfStu(ArrayList<Student> db, String last){
        int index = -1;
        for (int lcv = 0; lcv< db.size(); lcv++){
            if (db.get(lcv).getLastName().equals(last)) index = lcv;
        }
        return index;
    }
    public static void printStu(Student stu) {
        System.out.println("%s\t%s\t%s\t%s");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<Student>();

        while(true) {
            System.out.println("\n Student Menu: \n");
            System.out.println(" 1 - add new student:");
            System.out.println(" 2 - Display all students :");
            System.out.println(" 3 - Search for student:");
            System.out.println(" 4 - Search for student (last name):");
            System.out.println(" 5 - Modify student GPA:");
            System.out.println(" 6 - Remove Student:");
            System.out.println(" 7 - Exit \n\n Please enter your choice:");
            int c = input.nextInt();
            if(c == 1) {
                System.out.println("enter first name");
                String first = input.next();
                System.out.println("enter last name");
                String last = input.next();
                System.out.println("Enter Student ID");
                int id = input.nextInt();
                System.out.println("Eneter GPA");
                double gpa = input.nextDouble();
                Student st = new Student(first,last,id, gpa);
                db.add(st);
            }
            else if(c == 2) {
                System.out.println("first\tlast\tID\tGPA");
                for (Student stu : db)
                    printStu(stu);
            }
            else if(c == 3) {
                System.out.println("Enter Student ID");
                int id= input.nextInt();
                int index = indexOfStu(db,id);
                if (index!= -1) printStu(db.get(index));
                else System.out.println("No student with that ID");
            }
            else if(c == 4) {
                System.out.println("Enter Last Name");
                String last = input.next();
                int index = indexOfStu(db, last);
                if (index != -1) System.out.println("No student found with name");
            }
            else if(c == 5) {
                System.out.println("Enter Student ID");
                int id= input.nextInt();
                int index = indexOfStu(db,id);
                if(index == -1) System.out.println("No student found with that ID");
                else{
                    System.out.println("Enter GPA");
                    double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA updated Succesfully");
                }
            }
            else if(c == 6) {
                System.out.println("Enter Student ID");
                int id= input.nextInt();
                int index = indexOfStu(db,id);
                if (index == -1) System.out.println("No student found with that id");
                else db.remove(index);

            }else if(c == 7) {
                return;
            }


        }
    }

}