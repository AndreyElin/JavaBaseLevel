package lesson5;

public class Main {

    public static void main(String[] args) {

//        Создать массив из 5 сотрудников

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иван", "Иванов", "Иванович", "engineer","ivivan@mailbox.com","892312312", 30_000, 30);
        persArray[1] = new Person("Вадим", "Петров", "Олегович", "engineer","ivivan@mailbox.com","892312312", 40_000, 42);
        persArray[2] = new Person("Михаил", "Сидоров", "Феликсович", "designer","ivivan@mailbox.com","892312312", 25_000, 27);
        persArray[3] = new Person("Олег", "Семенов", "Николаевич", "tester","ivivan@mailbox.com","892312312", 10_000, 21);
        persArray[4] = new Person("Семен", "Дмитриев", "Петрович", "chief","ivivan@mailbox.com","892312312", 300_000, 55);

//        С помощью цикла вывести информацию только о сотрудниках старше 40 лет

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].personInfo();
            }
        }
    }
}
