/*public class Main {
    public static void main(String[] args) {
        LazyClass lazyObject = new LazyClass();
        System.out.println(lazyObject.getHello());

        // Викликаємо метод calculateSum
        int sum = lazyObject.calculateSum(5, 10);
        System.out.println("Sum: " + sum);
    }
} /*Для 1го завдання*/

/*public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Person
        Person person = new Person("Ігор", 23, "Чоловічий");

        // Викликаємо методи класу Person
        person.printInfo();
        int birthYear = person.calculateBirthYear();
        System.out.println("Рік народження: " + birthYear);
    }
} Для 2-го завдання*/

/*public class Main {
    public static void main(String[] args) {
        DeadCode.errorMessage();
    }
}  Для 3го завдання*/

/*public class Main {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = StringUtil.toUpperCase(input);
        System.out.println("Результат: " + result);
    }
} Для 4го завдання*/


/*public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        BetterCalculator betterCalculator = new BetterCalculator();

        int x = 5;
        int y = 3;

        // Використання методу add() з класу Calculator
        int sum1 = calculator.add(x, y);
        System.out.println("Сума з використанням Калькулятора: " + sum1);

        // Використання методу add() з класу BetterCalculator
        int sum2 = betterCalculator.add(x, y);
        System.out.println("Сума з використанням Кращого Калькулятора: " + sum2);
    }
}Для 5го завдання */




// Клас Main, який демонструє використання нових класів
import java.util.List; // Додано правильний імпорт

public class Main {
    public static void main(String[] args) {
        // Створюємо базу даних користувачів
        UserDatabase userDatabase = new UserDatabase();

        // Додаємо користувачів до бази даних
        userDatabase.addUser(new UserData("Ігор", 23));
        userDatabase.addUser(new UserData("Руслан", 22));

        // Отримуємо користувачів з бази даних і виводимо їх інформацію
        List<UserData> users = userDatabase.getUsers(); // Використовуємо правильний імпорт List
        for (UserData user : users) {
            System.out.println("Ім'я: " + user.getName() + ", Рік: " + user.getAge());
        }
    }
}


