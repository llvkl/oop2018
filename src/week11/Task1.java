package week11;


public class Task1 {
    public static <A extends Comparable> void sapxep(A[] array){
        A temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
            if(array[i].compareTo(array[j])>0){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
            }}
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");}
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] integers= { 6,9,1,45,2,4};
        sapxep(integers);
        Double[] doubles = {6.9,3.6,46.2,5.1,8.4};
        sapxep(doubles);
        Character[] characters= {'f','e','g','a','v','y'};
        sapxep(characters);
    }
}
