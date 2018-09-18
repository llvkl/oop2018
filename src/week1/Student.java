package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(String id) {
        this.id=id;
    }
    public String getId(){
        return id;
    }
    void setGroup(String group) {
        this.group=group;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail(){

        return email;
    }

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     }
     */
    Student() {
    name = "Student";
    id = "000";
    group = "INT22041";
    email = "uet@vnu.edu.vn";
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this.name= n;
        this.id=sid;
        this.email=em;
        group = "INT22041";

        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }

    String getInfo() {
        // TODO:
        System.out.println(name+"\n"+id+"\n"+group+"\n"+email);
        return null;
    }
}
