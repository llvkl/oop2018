package week3;

public class Week3 {

    public static int max(int m, int n) {
        if(m>n) return m;
        else return n;
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất

    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min=array[0];
        for(int i=0;i<array.length;i++)
            if(min > array[i]) {
                min=array[i];
            }
            return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = (height/(weight*weight/100/100));
        String a = null;
        if(BMI<18.5) a = "Thieu can";
        if(BMI>=18.5 && BMI<22.99) a = "Binh Thuong";
        if(BMI>=23 && BMI<24.99) a = "Thua Can";
        if(BMI>=25) a = "Beo phi";
        return a;
    }
    public static void main (String [] args){
        System.out.println(max(69,96));
        int[] a = {69,994,345,8,87};
        System.out.println(minOfArray(a));
        System.out.println(calculateBMI(165,55));
    }
}
