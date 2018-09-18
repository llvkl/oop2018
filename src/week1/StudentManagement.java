package week1;

public class StudentManagement {
        int n=0;
        Student[] students = new Student[100];
        // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
        public void Student (Student s) {
            while (n <= 100) {
                students[n] = s;
                n++;
            }
        }
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup()==s2.getGroup());

        }

    void studentsByGroup() {
        // TODO:

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

    }
}
