import java.util.*;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber = 20; //number N
        int computerNumber = (int) (Math.random() * 100);

        do {System.out.println(computerNumber + " Больше загаданного или меньше? Ведите ответ < или >");
            String str = sc.next();//считать ввод пользователя "<" или ">"
            if (str.equals("<")) {
                computerNumber = computerNumber+1;
            }
            else if (str.equals(">")){
                computerNumber = computerNumber-1;
            }
            //если число меньше то computerNumber = computerNumber++ до момента пока computerNumber == userNumber
            //если число больше, то  computerNumber = computerNumber-- до момента пока computerNumber == userNumber
        }
        while (userNumber!=computerNumber);


        System.out.println("Загаданное число было "+ computerNumber);  //вывести computerNumber
    }
}
