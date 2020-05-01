import com.example.education.practice001.Task001;
import com.example.education.practice001.Task002;

import com.example.education.practice002.TypesTasks;
//import com.example.education.practice003.*;
//import com.example.education.practice004.*;
import com.example.education.practice004.ChatParser;
import com.example.education.practice004.Palindrome;
//import com.example.education.practice005.*;

public class PracticeMain {

    private static String bigArrowsANDname = "======================>>>>>>>>>>>>>>>>>>>>>> %s";
    private static String smallArrowsANDname = "===>>> %s";


    private static void printHead(String name) {
        System.out.println();
        System.out.println(String.format(bigArrowsANDname,name));
        System.out.println();

    }

    private static void printLane(String name) {
        System.out.println();
        System.out.println(String.format(smallArrowsANDname,name));
        System.out.println();

    }


    public static void main(String[] args) {
        printHead("practice 1");
           Task001.printHello();
           Task002.quiz();
        printHead("practice 2");

        TypesTasks tt = new TypesTasks();


        printLane("Day of next NY");
        tt.NYDay(1);
        printLane("Day of NY + 5 years");
        tt.NYDay(5);

        printHead("practice 3");
        printHead("practice 4");


        printLane("Check Palindrome");

        Palindrome pa = new Palindrome();
        pa.checkPalindrome("1232,24me0");

        printLane("Chat Parser");

        ChatParser cp = new ChatParser();

        String[] nickNames = {
                "xxx", "yyy", "СССР", "шпак","Людмила" };
        String[] textLines = {
                "xxx: ну как там твой интровертный карантинный рай?)   ",
                "yyy: ну вот представь ",
                "yyy: все экстраверты сидят по домам   ",
                "yyy: и ещё и работу у большинства отменили    ",
                "yyy: так что теперь им не хватает общения и все они ежедневно пишут всем своим контактам( ",
                "yyy: серьёзно, я никогда так часто не переписывалась с большинством своих коллег, родственников и друзей  ",
                "yyy: как вторая работа, блин( ",
                "шпак: Как то забавно получилось? Вирус привезли богатые на самолётах, а расплачиваться как всегда бедным? ",
                "Людмила: Юристы есть в чате? Очень нужен совет..  ",
                "СССР: Тут только вирусологи. Ты пиши вопрос сразу. Вдруг был случай, разберём ",
                "xxx: кажется я постарел ) ",
                "xxx: не могу найти выход из стартовой локации в игре )    ",
                "yyy: Ахахахаха    ",
                "xxx: я даже кнопку выход там не нашел, как старпер вышел по Alt+F4    "};
     //   System.out.print(cp.printNickChatting(nickNames, textLines));

        printHead("practice 5");
    }
}
