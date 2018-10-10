package week4.task1;

import week4.task1.Cam;

/**
 * amount so luong
 * origin nguon goc
 */
public class CamSanh extends Cam {
    private int amount;
    private String origin;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getOrigin(){
        return origin;
    }
}
