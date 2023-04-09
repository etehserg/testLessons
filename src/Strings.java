/*Строки - базовые операции:
создать строку,
напечатать,
считать от пользователя,
получить размер,
получить подстроку*/
import java.util.Scanner;
public class Strings{
    /*public static void main (String[] args) {
        String str1 = "New String!"; //создали строку
        System.out.println(str1); //напечатали*/

        /*Scanner myScan = new Scanner(System.in); //инициализация сканера
        String str2 = myScan.nextLine(); //чтение строки, если строки нет, можно считать слово через next
        System.out.println(str2);

        int a = str2.length(); //string имеет размер, получаем через length
        System.out.println(a);*/

        /*Scanner myScan1 = new Scanner(System.in);
        String str3 = myScan1.nextLine();
        int beginString = 0; //начало подстроки
        int endString = 5; //конец подстроки
        String str4 = str3.substring(beginString, endString);  //выдаем подстроку из заданного диапазона, можно напечатать в sop
        System.out.println(str4);
    }*/



    public static void main(String[] args)  {
        /*int a = 7; //длина массива
        int[] array = new int[a];
        for (int i=0; i<array.length; i++){
            array[i]=i+1;
            System.out.println(array[i]+ " ");
        }*/

        /*считаем массив чисел
         1 2 3 4 5*/
        Scanner myScan3 = new Scanner(System.in);
        int a1 = 5;  //длина массива
        int array1[] = new int[a1];  //можно массив создать из строки методом split(ненужное)
        for (int i=0; i<a1; i++){
            array1[i]= myScan3.nextInt();
            System.out.println(array1[i]);
        }

        /*Scanner myScan4 = new Scanner(System.in);
        String str4 = myScan4.nextLine();
        int a4 = str4.length();
        System.out.println(a4);*/

    }

}