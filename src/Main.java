import java.util.ArrayList;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("wok@bk.ru");
        list.add("hh@inbox.ru");
        list.add("seven@list.ru");
        list.add("random@mail.ru");
        list.add("bot@list.ru");

        Spliterator<String> emails = list.spliterator();
        System.out.println("list of Emails:");
        emails.forEachRemaining(
                (n) -> System.out.println(n));
        System.out.println();


        // 2
        ArrayList<User> list2 = new ArrayList<User>();
        list2.add(new User("Eldar", 26));
        list2.add(new User("Eldar", 36));
        list2.add(new User("Eldar", 46));
        list2.add(new User("Eldar", 56));

        Spliterator<User> users = list2.spliterator();
        System.out.println("list of Emails:");
        users.forEachRemaining((n) -> print(n));


// 3
        System.out.println();
        ArrayList<String> names = new ArrayList<>();
        names.add("Eldar");
        names.add("Eldarbek");
        names.add("Roma");
        names.add("Anna");
        names.add("Elena");

        Spliterator<String> spliterator
                = names.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }

    public static void print(User u)
    {
        System.out.println("User name : " + u.name
                + " and user age: " + u.age);
    }
}