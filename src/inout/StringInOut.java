package inout;

import java.io.*;

public class StringInOut {
    public static void main(String[] args) throws IOException {

        //write static text
        String str = "I'm learning java with someone success, but my teacher meaning, that's it's good";
        File file = new File("str.txt");
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter writer = new BufferedWriter(osw);
        writer.write(str);
        writer.newLine();
        writer.close();

        //read static text
        File newFile = new File("str.txt");
        FileInputStream fos1 = new FileInputStream(newFile);
        InputStreamReader osw1 = new InputStreamReader(fos1);
        BufferedReader reader = new BufferedReader(osw1);
        System.out.println(reader.readLine());
    }

}
