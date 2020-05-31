package lesson5;

public class Person {

//    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст

    private String name;
    private String surnames;
    private String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

//    Конструктор класса должен заполнять эти поля при создании объекта

    public Person(String name, String surnames, String patronymic, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.surnames = surnames;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

//    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль

    public void personInfo() {
        System.out.printf("%s %s %s, должность: %s, email: %s, телефон: %s, зарплата: %d, возраст: %d \n", surnames, name, patronymic, position, email, phoneNumber, salary, age);
    }
}
