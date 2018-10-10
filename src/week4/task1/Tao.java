package week4.task1;

import week4.task1.HoaQua;

/**
 *Characteristics táo ngọt hay chua
 * sold đã bán hay chưa
 */
public class Tao extends HoaQua {
    private String Characteristics;
    private String sold;

    public void setCharacteristics(String Characteristics) {
        this.Characteristics=Characteristics;
    }

    public String getCharacteristics() {
        return Characteristics;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public String getSold() {
        return sold;
    }
}
