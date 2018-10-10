/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;

/**
 * Khoi tao class HoaQua
 * color mau sac cua hoa qua
 * cost: gia hoa qua
 */
public  class HoaQua{
    private String Color;
    private double Cost;
    public void setColor(String Color) {
        this.Color = Color;
    }
    public String getColor(){
        return Color;
    }
    public void setCost(double Cost){
        this.Cost=Cost;
    }
    public double getCost(){
        return Cost;
    }
}