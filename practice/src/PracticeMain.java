import com.example.education.practice001.Task001;
import com.example.education.practice001.Task002;

import com.example.education.practice002.TypesTasks;

import com.example.education.practice003.*;
import com.example.education.practice004.ChatParser;
import com.example.education.practice004.Palindrome;
import com.example.education.practice004.SnilsValidator;
import com.example.education.practice005.VehicleTypes;

import java.util.ArrayList;
import java.util.Arrays;
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
        printLane("Task 1.");
           Task001.printHello();
        printLane("Task 2.");
           Task002.quiz();
        printHead("practice 2");

        TypesTasks tt = new TypesTasks();
        printLane("Task 1.");
        byte a = 12;
        tt.task1(a);
        a = -128;
        tt.task1(a);
        printLane("Task 2.");
        tt.task2();
        printLane("Task 3.");
        tt.task3();
        printLane("Task 4.");
        tt.task4();
        printLane("Task 5.");
        tt.task5(5);
        tt.task5(64);
        printLane("Task 6. Day of next NY");
        tt.NYDay(1);
        printLane("Task 6. Day of NY + 5 years");
        tt.NYDay(5);

        printHead("practice 3");

        printLane("Task 1. Performance");

        Perforator.comparePerf();

        printLane("Task 2. BitImage");

        long l = 235135135L;

        System.out.println(l + " ===>>> " + Long.toBinaryString(l));

        double d = 75.38;
        String sResult = "";
        long numberBits = Double.doubleToLongBits(d);

        sResult = Long.toBinaryString(numberBits);
        System.out.println("Представление вещественного числа в формате чисел с плавающей точкой");

        System.out.format("Число: %5.2f\n", d);
        System.out.println("Формат чисел с плавающей точкой:");

//ведущий ноль заботливо сокращен системой, поэтому его нужно восстановить
        System.out.println(d > 0 ? "0" + sResult : sResult);


        printLane("Task 3. Array compression");

        ArrayList<Integer> arrayList4Compression = new ArrayList<Integer>();
        arrayList4Compression.add(1);
        arrayList4Compression.add(2);
        arrayList4Compression.add(2);
        arrayList4Compression.add(2);
        arrayList4Compression.add(3);
        arrayList4Compression.add(3);
        arrayList4Compression.add(4);
        arrayList4Compression.add(3);
        arrayList4Compression.add(4);
        arrayList4Compression.add(4);
        arrayList4Compression.add(4);
        arrayList4Compression.add(4);
        arrayList4Compression.add(1);
        arrayList4Compression.add(1);
        arrayList4Compression.add(2);
        System.out.println("Initial Array: " + arrayList4Compression.toString());
        ArrayList<Integer> arrayList4Compressed = new ArrayList<Integer>();
        System.out.println("Compressed" +
                " Array: " + Compress.compress(arrayList4Compression).toString());
        System.out.println("Decompressed" +
                " Array: " + Compress.decompress(Compress.compress(arrayList4Compression)).toString());

        System.out.println("Arrays are " + (arrayList4Compression.equals(Compress.decompress(Compress.compress(arrayList4Compression))) ? "equal" : "not equal"));

        printLane("Task 4. Union and sort ");

        long[] longA = {222,777,333};
        long[] longB = {888,555,111};

        System.out.println(Arrays.toString(UnionSort.unionAndSort(longA,longB)));

        printLane("Task 5. Group by contract ");

        Contracts.parse();


        printLane("Task 6. Long array ");

        int[] longArray = LongArray.formArray(15);
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + ",");
        }


        printHead("practice 4");


        printLane("Task 1. Check Palindrome");

        Palindrome pa = new Palindrome();
        String maybePalindrome = "1232,24m  e0";
        System.out.println(maybePalindrome + (pa.checkPalindrome(maybePalindrome) ? " is " : " is not") + " a palindrome" );

        maybePalindrome = "a,,ni...ki%$n@#$a";
        System.out.println(maybePalindrome + (pa.checkPalindrome(maybePalindrome) ? " is " : " is not") + " a palindrome" );

        printLane("Task 2. SNILS");
        SnilsValidator sv = new SnilsValidator();
        String snils = "123-435-462 30";
        System.out.println(snils + (sv.validate(snils) ? " is " : " is not") + " valid" );
        System.out.println("checksum for " + snils + (sv.snilsCheckSum(snils) ? " is " : " is not") + " valid" );


        printLane("Task 3. Chat Parser");

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
