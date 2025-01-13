import java.util.Arrays;
import java.util.Scanner;
class laba1
{
    //ДЛЯ ЗАДАНИЯ А
    public int sum(int n)
    {
        int suma = 0;
        while (n>0)
        {
           suma += n%10;
           n /=10;
        }
        return suma;
    }
    public void A(int x)
    {
        for ( x = 0; x <= 300; x++) {
            if (x % 4 == 0 && x % 6 != 0 && sum(x) < 10) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
    //ДЛЯ ЗАДАНИЯ Б
    public String MiddleBYKVA(String bykva)
    {
        if (bykva.length() % 2 == 0)
        {
            return bykva.substring(bykva.length()/2-1, bykva.length()/2+1);
        }
        else
        {
            return "Строка должна иметь четную длину";
        }
    }
    //ДЛЯ ЗАДАНИЯ С (функция подсчета уникальных слов->функция поиска минимального количества слов)
    //прописать через сплит разделение а не в ручную, потом по массиву мин искать мин значения инта
    //как различие сделать? по аське или просто сравнением с переходом(попробую его)
    public int UniqueSLOVA(String str)
    {
        //indexOf на проверки символа если есть то индекс если нет -1
        String t = "";
        int count =0;
        for (int i=0; i<str.length();i++)
        {
            if (t.indexOf(str.charAt(i))==-1)
            {
                t+=str.charAt(i);
            }
        }
        return t.length();
    }
    public String slovoDef(String text)
    {
        String[] words = text.split("\\s+");//любой пробельный символ
        String minWord = words[0];
        int minCount = UniqueSLOVA(words[0]);
        for(int i=1;i<words.length; i++)
        {
            int count = UniqueSLOVA(words[i]);
            {
                if (count < minCount)
                {
                    minWord = words[i];
                    minCount = count;
                }
            }
        }
        return minWord;
    }

    //ДЛЯ ЗАДАНИЯ Д
    //аськой пользоваться?
    public int LATINIZAKOLVO(String mnoga)
    {
        String[] words = mnoga.split("\\s+");
        int count =0;
        for(int i = 0; i < words.length; i++)
        {
        String word = words[i];
        if (word.matches("[a-zA-Z]+"))//слияние диапозонов (латиница от а до з и + -один или более раз (квантифакторы колва символов)
        {
            count++;
        }
    }
        return count;
    }

}

public class Main {
public static void main(String[] args) {
    laba1 lab = new laba1();
    // Задание А
    lab.A(0); // Запускаем метод A для задания А

    // Задание Б !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!как в лабе 5 1 курса поробовать
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите строку с четным количеством символов:");
    String input = scanner.nextLine();
    System.out.println("Результат: " + lab.MiddleBYKVA(input));

    // Задание С
    System.out.println("Введите строку с словами:");
    input = scanner.nextLine();
    System.out.println("Результат: " + lab.slovoDef(input));

    // Задание Д
    System.out.println("Введите предложение:");
    input = scanner.nextLine();
    System.out.println("Результат: " + lab.LATINIZAKOLVO(input));
}
}
