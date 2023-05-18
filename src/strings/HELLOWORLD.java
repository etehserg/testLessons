package strings;

public class HELLOWORLD {
    public static void main(String[] args){
        String str = "Hello World";
        String strReplace = str.replaceAll(" ", "");
        String strUpperCase = strReplace.toUpperCase();
        System.out.println(strUpperCase);
    }
}