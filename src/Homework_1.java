import java.util.Arrays;
public class Homework_1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку
        //Привести к правильному виду (Ниже) используя String.trim()
        hi = hi.trim();
        world = world.toLowerCase();
        String resultString = hi + world + newLine;
        //затроить (Можно вызвать тольку одну команду System.out.println())
        String tripleString = resultString.repeat(3);
        System.out.println(tripleString);
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        float High = 1.65f;
        float Weight = 60f;
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        float IMT = Weight / (High * High);
        System.out.println(IMT);
        //Пример результата вывода на экран:
        //21.0345645

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        char[] letterArray = new char[] {'a', 'b', 'c', 'd', 'e'};
        System.out.println(letterArray);

        letterArray[3] = 'h';
        System.out.println(letterArray);

        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche

        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

        System.out.println(Integer.parseInt("234") + "some_text".length());

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int A = 3;
        int B = 5;
        int square = (A*B)*(A*B);
        System.out.println(square);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        int[] numArray1 = new int[] {1, 2, 5, 7, 10};
        int[] numArray2 = new int[] {2, 3, 2, 17, 15};
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int [] resultArray = new int[15];
        for (int i = 0; i < 5; i++) {
            resultArray[i] = numArray1[i];
            resultArray[i + 5] = numArray2[i];
            resultArray[i + 10]  = numArray1[i] * numArray2[i];}
        System.out.println(Arrays.toString(resultArray));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        String StringLtoR = "Hello world!";
        StringLtoR = StringLtoR.replace('l', 'r').toUpperCase().substring(0, 8);
        System.out.println((StringLtoR));

//      Попробовать запушить изменения
//

        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}