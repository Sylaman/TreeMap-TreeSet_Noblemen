import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Egor", "Korshunov", 31));
        people.add(new Person("Anastasia", "Kunitskaya", 30));
        people.add(new Person("Nikolay", "Rimsky Korsakov", 55));
        people.add(new Person("Dmitry", "Mamin Sibiryak", 60));
        people.add(new Person("Mohamed", "Ali Ahmed Yusuf Mohamed", 20));
        people.add(new Person("Zaina","Ali Zaki Ahmed Mohamed Ahmed", 16));

        Collections.sort(people, new SurnameLengthComparator(4));
        Collections.reverse(people);
        System.out.println(people);
    }
}
