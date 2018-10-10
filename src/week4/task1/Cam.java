package week4.task1;

import week4.task1.HoaQua;

/**
 * weight can nang
 * classfy phan loai cam
 */
public class Cam extends HoaQua {
       private double Weight;
       private String Classfy;
       double doanxem;

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        this.Weight = weight;
    }

    public String getClassfy() {
        return Classfy;
    }

    public void setClassfy(String classfy) {
        this.Classfy = classfy;
    }
}

