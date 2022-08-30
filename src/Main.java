import java.util.*;

public class Main {

    public static void main(String[] args) {

        int maxWordsInSurname = 4;
        List<Person> people = new ArrayList<>();

        people.add(new Person("Egor", "Korshunov", 31));
        people.add(new Person("Anastasia", "Kunitskaya", 30));
        people.add(new Person("Zaina", "Ali Zaki Ahmed Mohamed Ahmed", 16));
        people.add(new Person("Nikolay", "Rimsky Korsakov", 55));
        people.add(new Person("Dmitry", "Mamin Sibiryak", 60));
        people.add(new Person("Mohamed", "Ali Ahmed Yusuf Mohamed", 20));
        people.add(new Person("Nikolay", "Borisov", 10));


        Comparator<Person> comparator = (p1, p2) -> {
            String[] firstSurname = p1.getSurname().split(" ", maxWordsInSurname);
            String[] secondSurname = p2.getSurname().split(" ", maxWordsInSurname);
            if (firstSurname.length < secondSurname.length) {
                return -1;
            } else if (firstSurname.length > secondSurname.length) {
                return 1;
            } else {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        people.removeIf((p1) -> p1.getAge() < 18);

        Collections.sort(people, comparator);
        Collections.reverse(people);
        System.out.println(people);
    }
}
