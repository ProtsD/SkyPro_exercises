package com.skypro.course1.hw10_strings;

public class Main {
    public static void main(String[] args) {
        String phone = "960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////// Exercise 1 //////////////
        /*
        Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
        и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
        Напишите четыре строки:
        первая с именем firstName — для хранения имени;
        вторая с именем middleName — для хранения отчества;
        третья с именем lastName — для хранения фамилии;
        четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: “ФИО сотрудника — ….”
        В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("\nExercise 1");
        System.out.println("ФИО сотрудника — " + fullName);

        ////////////// Exercise 2 //////////////
        /*
        Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников, полностью
        написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью
        заглавные буквы. В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        */
        System.out.println("\nExercise 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        ////////////// Exercise 3 //////////////
        /*
        Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        */
        fullName = "Иванов Семён Семёнович";
        System.out.println("\nExercise 3");
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));

        ////////////// Extra Exercise 5 //////////////
        /*
        К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с
        Ф. И. О. на три — на фамилию, имя и отчество.
        В качестве исходных данных используйте:
        Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        переменная firstName — для хранения имени;
        переменная middleName — для хранения отчества;
        переменная lastName — для хранения фамилии.
        Решите задание с помощью метода substring().
        Результат программы выведите в формате:
        “Имя сотрудника — …”
        “Фамилия сотрудника — …”
        “Отчество сотрудника — ...”
        :bulb: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено.
        Их должен вычислить компьютер.
        :sos: Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
        */
        fullName = "Ivanov Ivan Ivanovich";
        int firstBlankIndex = fullName.indexOf(" ");
        int secondBlankIndex = fullName.lastIndexOf(" ");
        lastName = fullName.substring(0, firstBlankIndex);
        middleName = fullName.substring(secondBlankIndex, fullName.length());
        firstName = fullName.substring(firstBlankIndex, secondBlankIndex);
        System.out.println("\nExtra Exercise 5");
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        ////////////// Extra Exercise 6 //////////////
        /*
        Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в
        правильный формат. В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
        которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
        Подсказка 1
        Метод toCharArray() может быть полезен.
        Подсказка 2
        Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.

        */

        fullName = "avanov bvan cvanovich";
        String fullNameInLoop = "";
        String[] words = fullName.split(" ");
        System.out.println("\nExtra Exercise 6");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase().concat(words[i].substring(1));
            fullNameInLoop = fullNameInLoop.concat(words[i] + " ");
            if (i == words.length - 1) {
                fullName = fullNameInLoop.trim();
            }
        }
        System.out.println(fullName);

        ////////////// Extra Exercise 7 //////////////
        /*
        Имеется две строки.
        Первая: "135"
        Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456".
        Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….”
        :sos: Подсказка
        Следует использовать StringBuilder.
        */
        String str1 = "135";
        String str2 = "246";
        StringBuilder strCombResult = new StringBuilder();
        for (int i = 0; i < str1.length() && str1.length() == str2.length(); i++) {
            strCombResult.append(str1.substring(i, i + 1));
            strCombResult.append(str2.substring(i, i + 1));
        }
        System.out.println("\nExtra Exercise 7");
        System.out.println(strCombResult);

        ////////////// Extra Exercise 8 //////////////
        /*
        Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        Нужно найти и напечатать буквы, которые дублируются в строке.
        Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
        В итоге в консоль должен быть выведен результат программы: "acdgijk".
        */
        String strSorted = "aabccddefgghiijjkk";
        char[] charArray = strSorted.toCharArray();
        System.out.println("\nExtra Exercise 8");
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                System.out.print(charArray[i]);
            }
        }
    }
}