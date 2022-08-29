import java.util.*;

public class Main {

    public static void main(String[] args) {

        int maxWordsInSurname = 4;
        List<Person> people = new ArrayList<>();

        people.add(new Person("Egor", "Korshunov", 31));
        people.add(new Person("Anastasia", "Kunitskaya", 30));
        people.add(new Person("Nikolay", "Rimsky Korsakov", 55));
        people.add(new Person("Dmitry", "Mamin Sibiryak", 60));
        people.add(new Person("Mohamed", "Ali Ahmed Yusuf Mohamed", 20));
        people.add(new Person("Zaina", "Ali Zaki Ahmed Mohamed Ahmed", 16));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] firstSurname = o1.getSurname().split(" ", maxWordsInSurname);
            String[] secondSurname = o2.getSurname().split(" ", maxWordsInSurname);
            if (firstSurname.length < secondSurname.length) {
                return -1;
            } else if (firstSurname.length > secondSurname.length) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(people, comparator);
        Collections.reverse(people);
        System.out.println(people);
    }
}
