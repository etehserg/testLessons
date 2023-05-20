package inout;

import java.io.*;
import java.util.Date;

public class ObjectInOut {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write object
        File file = new File("t.tmp");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("today");
            oos.writeObject(new Date());
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read static text
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String today = (String) ois.readObject();
        Date date = (Date) ois.readObject();
        ois.close();
        System.out.println(today);
        System.out.println(date);
    }
}
