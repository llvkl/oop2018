//package week2.task1;
//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class Task1 {
//
//    public static int gcd(int a, int b) {
//        // TODO: Tính ước chung lớn nhất của 2 số a, b
//        while(a!=b) {
//            if (a > b) a = a - b;
//            else b = b - a;
//        }
//        return a;
//    }
//
//    public static int fibonacci(int n) {
//        // TODO: Tìm số fibonacci ở vị trí n
//        int f=0,f1=0,f2=1;
//        for(int i =0;i<n;i++){
//            f=f1+f2;
//            f1=f2;
//            f2=f;
//        }
//        return f;
//    }
//    public static void main (String [] args){
//        System.out.println(gcd(40,60));
//        Scanner nhapn = new Scanner(System.in);
//        int n = nhapn.nextInt();
//        for(int i=0;i<n;i++)
//            System.out.println(fibonacci(i));
//
//        if (a==0) return b;
//        return gcd(b%a,a);
//    }
//
//    public static int fibonacci(int n) {
//        if (n == 0) return 0;
//        else if (n == 1) return 1;
//        else{
//        return fibonacci(n-1) + fibonacci(n-2);
//    }}
//
//    public static void main(String[] args) {
//        System.out.println("UCLN"+gcd(40,60));
//        System.out.println(fibonacci(7));
//        //test
//
//    }
//}
//
