package lesson_8.phoneBook;

public class Main {
    public static void main(String[] args) {
        Contacts vasyan = new Contacts("Vasiliy", "+79147550000", "afk@mail.ru");
        Contacts masha = new Contacts("Maria", "+79147550001", "mj@mail.ru");
        Contacts vika = new Contacts("Viktoria", "+79147550002", "vik@mail.ru");
        Contacts sasha = new Contacts("Aleksandr", "+79147550003", "alek@mail.ru");
        Contacts katusha = new Contacts("Ekaterina", "+79147550004", "kat@mail.ru");

        phoneBook phoneBook = new phoneBook();
        phoneBook.addContact(vasyan);
        phoneBook.addContact(masha);
        phoneBook.addContact(vika);
        phoneBook.addContact(sasha);
        phoneBook.addContact(katusha);
    }


}
