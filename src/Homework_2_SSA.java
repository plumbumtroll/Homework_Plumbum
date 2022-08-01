public class Homework_2_SSA {
    public static void main(String[] args) {

        // Базовый уровень

        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");

        }
        System.out.print('\n');
        // Ожидаемый результат: 1а 2а 3а .. 100а
        //

        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        // Способ 1:
        double ageChildren1 = 13.5;
        if (ageChildren1 < 6) {
            System.out.println("пошел в детский сад");
        }
        if ((ageChildren1 >= 6) && (ageChildren1 < 11)) {
            System.out.println("пошел в младшую школу");
        }
        if ((ageChildren1 >= 11) && (ageChildren1 < 17)) {
            System.out.println("пошел в среднюю школу");
        }
        if (ageChildren1 > 17) {
            System.out.println("пошел в университет");
        }

        // Способ 2:
        int ageChildren2 = 30;
        if (ageChildren2 < 6)
            System.out.println("пошел в детский сад");
        else if (ageChildren2 < 11)
            System.out.println("пошел в младшую школу");
        else if (ageChildren2 < 17)
            System.out.println("пошел в среднюю школу");
        else System.out.println("пошел в университет");


        // Задание №3
        // Задача: Повара попросили сделать салат.
        // Дано:
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
//        Для проверок:
//        boolean vegetables = true;
//        boolean toast = false;
//        boolean eggs = false;
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        if (chicken && vegetables && sour && toast)
            System.out.println("Ваш Цезарь готов!");
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
            else if (vegetables && eggs && (sausage||chicken))
            System.out.println("Ваш Оливье готов!");
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
            else if (vegetables)
            System.out.println("Овощной салат готов.");
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
            else if (!(chicken&&vegetables&&sour&&toast&&sausage&&eggs))
        System.out.println("Невозможно сделать салат. У меня ничего нет.");
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.
        class Bird {
            private String specie;
            private Boolean isFly;

            public String getSpecie() {
                return specie;
            }

            public void setSpecie() {
                this.specie = specie;
            }

            public Boolean getIsFly() {
                return isFly;
            }

            public void setIsFly() {
                this.isFly = isFly;
            }

            public void birdInfo() {
                System.out.println(specie + " can fly: " + isFly);
            }

            Bird() {
                specie = "Unknown specie";
                this.isFly = isFly;
            }

            Bird(String name) {
                specie = name;
                this.isFly = isFly;
            }

            Bird(String name, Boolean isFly) {
                specie = name;
                this.isFly = isFly;
            }
        }

        Bird Kiwi = new Bird("Kiwi", false);
        Bird Crow = new Bird("Crow", true);
        // проверяю, как оно работает:
        Kiwi.birdInfo();
        Crow.birdInfo();



        // Продвинутый уровень

        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Другой инкремент для проверки:
        // double increment = 2;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        double count = 0;
        if (result >= 0) {
            while (result < 1000000) {
                result = result + increment;
                count++;
            }
            System.out.println("Количество совершённых итераций: " + count);
        }
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        byte[] binaryArray = {1, 1, 1, 1, 1, 1, 1, 1};
        // Вывожу первоначальный массив:
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        // Заменяю чётные члены массива нулями:
        for (int i = 0; i < binaryArray.length; i++) {
            if (i % 2 == 0) {
                binaryArray[i] = 0;
            }
        }
        System.out.println();
        // Вывожу обработанный массив:
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        System.out.println();

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        double price = 0;
        int problemCount = 0;
        if ((!hasFuel)&&!(hasElectricsProblem||hasMotorProblem||hasWheelsProblem||hasTransmissionProblem)) {
            System.out.println("Машина исправна, цена консультации - 1000 рублей.");
        }
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        if (hasMotorProblem) {
            problemCount = problemCount + 1;
            price = price + 10000;
        }
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        if (hasElectricsProblem) {
            problemCount = problemCount + 1;
            price = price + 5000;
        }
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        if (hasTransmissionProblem) {
            problemCount = problemCount + 1;
            price = price + 4000;
        }
        // Если у машины проблема с колесами, то чинят и берут 2000.
        if (hasWheelsProblem) {
            problemCount = problemCount + 1;
            price = price + 2000;
        }
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        if (problemCount >= 2) {
            price = 0.9 * price;
        }
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        if (hasTransmissionProblem&&(hasElectricsProblem||hasMotorProblem)) {
            price = price * 0.8;
        }
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
        System.out.println("Цена за ремонт = " + price);


        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
        // Не повторяющиеся

        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто
    }
}

