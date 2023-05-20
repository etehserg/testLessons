package inout;

/*[Input/Output] Write into and then read from a file:
Objects (you can directly write and read complete objects without serializing them into strings) using the ObjectInputStream and ObjectOutputStream
*/

import java.io.*;

public class InputOutput {
    public static void main(String[] args) {

       //write static values
        boolean bool = true;
        float fl = -10.235f;
        int i = 10500;
        File file = new File("primitive.bin");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBoolean(bool);
            dos.writeFloat(fl);
            dos.writeInt(i);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read static values from file
        File newFile = new File("primitive.bin");
        try {
            FileInputStream fos = new FileInputStream(newFile);
            DataInputStream dos = new DataInputStream(fos);
            System.out.println(dos.readBoolean());
            System.out.println(dos.readFloat());
            System.out.println(dos.readInt());
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
