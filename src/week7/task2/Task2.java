package week7.task2;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    String[] a;
    int[] b = new int[6];
    public void NullPointerException() throws NullPointerException{
        System.out.println(a.length);
    }
    public  void  Arrayindexofboundexception() throws  ArrayIndexOutOfBoundsException{
        System.out.println(b[69]);
    }
    public  void ArithmeticException() throws  ArithmeticException{
        int s=69/0;
    }
    public void ClassCastException() throws ClassCastException{
        throw  new ClassCastException();
    }
    public void IOException() throws IOException{
        throw new IOException();
    }
    public void FilenotFound() throws FileNotFoundException{
        throw  new FileNotFoundException();
    }
    public static void main(String[] args) {
        Task2 guesswhat = new Task2();
        try {
            guesswhat.NullPointerException();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            guesswhat.Arrayindexofboundexception();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            guesswhat.ArithmeticException();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            guesswhat.ClassCastException();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            guesswhat.IOException();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            guesswhat.FilenotFound();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
