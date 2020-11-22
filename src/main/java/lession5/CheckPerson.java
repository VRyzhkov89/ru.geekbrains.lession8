package lession5;

public class CheckPerson {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person(
                "Иванов",
                "Иван",
                "Иванович",
                "Дворник",
                "Ivanov@mail.ru",
                "89031111111",
                15000.00,
                42);
        persArray[1] = new Person(
                "Скворцов",
                "Андрей",
                "Владимирович",
                "техник",
                "skvorets@mail.ru",
                "89032222222",
                25000.00,
                29);
        persArray[2] = new Person(
                "Багров",
                "Денис",
                "Игоревич",
                "Начальник технического отдела",
                "bagrov@mail.ru",
                "89033333333",
                45000.00,
                45);
        persArray[3] = new Person(
                "Сидоров",
                "Дмитрий",
                "Петрович",
                "Заместитель директора",
                "sidor@mail.ru",
                "89034444444",
                60000.00,
                38);
        persArray[4] = new Person(
                "Петров",
                "Петр",
                "Иванович",
                "Директор",
                "petrov@mail.ru",
                "89035555555",
                90000.00,
                50);
        for (Person person: persArray) {
            if (person.age > 40) {
            person.printDetails();
            }
        }
    }
}
