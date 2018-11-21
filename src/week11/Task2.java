package week11;

import java.util.ArrayList;

public class Task2 {
    public static <A extends Comparable> void getmax(ArrayList<A> array){
        A max = array.get(0);
        for(int i=0;i<array.size();i++){
            if(array.get(i).compareTo(max)>0){
                max = array.get(i);
            }
    }
        System.out.println(max);
}
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(23);
        integers.add(69);
        integers.add(31);
        getmax(integers);
    }
}
