package lession5;

public class Person {

    String surname;
    String name;
    String patronimic;
    String position;
    String mail;
    String phone_number;
    double salary;
    int age;

    public Person(String surname,String name,String patronimic,String position,
                  String mail,String phone_number,double salary,int age) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.position = position;
        this.mail = mail;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;

    }

    public void printDetails() {
        System.out.println(surname +
                " " + name +
                " " + patronimic +
                " " + ", в должности: " + '\'' + position + '\'' +
                "\n\temail: " + mail +
                "\n\tНомер телефона: " + phone_number +
                "\n\tЗаработная плата: " + salary +
                "\n\tВозраст: " + age + "\n");
    }
}
