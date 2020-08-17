package example.hw7;

public class BasePhoneBook {
    public static void main(String[] args) {
        System.out.println("Телефонный справочник");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Петров", "463535");
        phoneBook.add("Иванов", "463536");
        phoneBook.add("Петров", "757535");
        phoneBook.add("Сидоров", "838335");
        phoneBook.add("Козлов", "4637835");
        phoneBook.add("Кукушкин", "343535");
        phoneBook.add("Иванов", "565576");
        phoneBook.add("Петров", "555555");
        phoneBook.add("Жуков", "666666");
        phoneBook.add("Мирошкин", "777777");

        System.out.println("****************");

        System.out.println("Номера телефонов по фамилии:");
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Иванов" + phoneBook.get("Иванов"));
        System.out.println("Сидоров" + phoneBook.get("Сидоров"));
        System.out.println("Козлов" + phoneBook.get("Козлов"));
        System.out.println("Кукушкин" + phoneBook.get("Кукушкин"));
        System.out.println("Жуков" + phoneBook.get("Жуков"));
        System.out.println("Мирошкин" + phoneBook.get("Мирошкин"));

        System.out.println("****************");

        System.out.println("Кузнецов" + phoneBook.get("Кузнецов"));

        System.out.println("****************");

        phoneBook.add("Иванов", "223344");
        System.out.println("Иванов" + phoneBook.get("Иванов"));
    }
}
