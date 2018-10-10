package week4.task1;

public class Main {
    public static void main(String[] args){
        CamThanhPhong cam1 = new CamThanhPhong();
        cam1.setClassfy("Thuộc loại cam thanh phong");
        cam1.setDate(29/2);
        cam1.setColor("Vàng");
        CamSanh cam2 = new CamSanh();
        cam2.setClassfy("Đoán xem");
        cam2.setWeight(9.9);
        cam2.setCost(6.9);
        Tao tao= new Tao();
        tao.setCharacteristics("Ngọt");
        tao.setColor("Đỏ");
        System.out.println(cam1.getClassfy());
        System.out.println(cam1.getDate());
        System.out.println(cam1.getColor());
        System.out.println(cam2.getClassfy());
        System.out.println(cam2.getWeight());
        System.out.println(cam2.getCost());
        System.out.println(tao.getCharacteristics());
        System.out.println(tao.getColor());
    }
}
