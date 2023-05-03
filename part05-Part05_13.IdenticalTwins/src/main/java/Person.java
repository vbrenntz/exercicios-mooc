
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person other = (Person) compared;

        if (!this.name.equals(other.name)) {
            return false;
        }

        if (this.height != other.height) {
            return false;
        }

        if (this.weight != other.weight) {
            return false;
        }

        if (!this.birthday.equals(other.birthday)) {
            return false;
        }

        return true;
    }
}
