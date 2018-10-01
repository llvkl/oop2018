package week1;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

public class StudentManagement {

    public ArrayList<Student> nani = new ArrayList<> (100);{

    }
        // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup()==s2.getGroup());

        }

    void studentsByGroup() {
        // TODO:
        Set<Student> set = new HashSet<Student>();
        Iterator <Student> iterator = set.iterator();
        Student student;
        while (iterator.hasNext()){
            student = iterator.next();
            System.out.println(student.getInfo());}
    }

//    void removeStudent(String id) {
        // TODO:
//    }

    public static void main (String[] args) {
        // TODO:
        Student doanxem = new Student();
        doanxem.setName("Nong Dinh Tuyen");
        doanxem.setId("17021117");
        doanxem.setGroup("INT22041");
        doanxem.setEmail("lllllvkl@gmail.com");
        doanxem.getInfo();
        Student a = new Student();
        a.getInfo();
        Student b = new Student("DOAN XEM 1","DOAN XEM 2","DOAN XEM 3");
        b.getInfo();
        Student c = new Student(b);
        c.getInfo();
        Student dx1 = new Student("dx1", "111","meow1");
        dx1.setGroup("INT22041");
        Student dx2 = new Student("dx2", "222","meow2");
        dx2.setGroup("INT22041");
        Student dx3 = new Student("dx3", "333","meow3");
        dx3.setGroup("INT22042");
        StudentManagement gopro = new StudentManagement();
        System.out.println(gopro.sameGroup(dx1,dx2));
        System.out.println(gopro.sameGroup(dx2,dx3));
        System.out.println(gopro.sameGroup(dx1,dx3));
        gopro.nani.add(doanxem);
        gopro.nani.add(a);
        gopro.nani.add(b);
        gopro.nani.add(c);
        gopro.studentsByGroup();
    }
}
