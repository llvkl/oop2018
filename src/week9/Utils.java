package week9;


import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(path)));
            String currentLine;
            while ((currentLine = bf.readLine()) != null) {
                System.out.println(currentLine);
            }
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return null;
    }
    public static void writeContentToFile(String path){
        try{
            BufferedWriter bf = new BufferedWriter(new FileWriter(new File(path)));
            bf.write("kha banh");
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeContentToFile2(String path){
        try{
            BufferedWriter bf = new BufferedWriter(new FileWriter(new File(path),true));
            bf.write("kha banh quay cuc manh");
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String filename){
        File file = new File(folderPath+"/"+filename);
        try {
            FileReader khabanh = new FileReader(file);
            System.out.println("tim thay file "+filename);
        } catch (FileNotFoundException e) {
            System.out.println("ko tim thay file");
            e.printStackTrace();
        }
        return file;
    }
    public static void main(String[] arg){
        readContentFromFile("C:\\Users\\Admin\\IdeaProjects\\oop2018\\src\\week9\\khabanh.txt");
        writeContentToFile("C:\\Users\\Admin\\IdeaProjects\\oop2018\\src\\week9\\khabanh.txt");
        //writeContentToFile2("C:\\Users\\Admin\\IdeaProjects\\oop2018\\src\\week9\\khabanh.txt");
        Utils.findFileByName("C:\\Users\\Admin\\IdeaProjects\\oop2018\\src\\week9", "khabanh.txt");
    }
}

