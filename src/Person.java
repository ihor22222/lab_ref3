import java.time.Year;

public class Person {
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Метод для виведення інформації про людину
    public void printInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Рік: " + age);
        System.out.println("Пол: " + gender);
    }

    // Метод для обчислення року народження
    public int calculateBirthYear() {
        int currentYear = Year.now().getValue(); // Отримуємо поточний рік
        return currentYear - age;
    }
}
