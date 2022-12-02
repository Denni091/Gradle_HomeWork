package ua.hillel;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Andrew", "Jonson", "Ukraine", 30);
        System.out.println("Name: " + human.getName() +
                "\nSurname: " + human.getSurName() +
                "\nCountry: " + human.getCountry() +
                "\nAge: " + human.getAge());
    }
}