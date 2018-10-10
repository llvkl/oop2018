package week4.task1;

import week4.task1.Cam;

/**
 * name ten cua cam
 * date ngay nhap
 */
public class CamThanhPhong extends Cam {
    private String name;
    private int date;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }
}
