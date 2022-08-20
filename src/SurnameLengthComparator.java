import java.util.Comparator;

public class SurnameLengthComparator implements Comparator<Person> {

    int maxWordsInSurname;

    public SurnameLengthComparator(int maxWordsInSurname) {
        this.maxWordsInSurname = maxWordsInSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] firstSurname = o1.getSurname().split(" ", maxWordsInSurname);
        String[] secondSurname = o2.getSurname().split(" ", maxWordsInSurname);
        if (firstSurname.length < secondSurname.length) {
            return -1;
        } else if (firstSurname.length > secondSurname.length) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
