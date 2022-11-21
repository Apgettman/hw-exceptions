package collection;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final int number;
    private final String lastName;
    private final String name;
    private final LocalDate localDate;

    public Passport(int number, String lastName, String name, LocalDate localDate) {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Паспорт:" +
                " №" + number +
                ", Фамилия: '" + lastName + '\'' +
                ", Имя: '" + name + '\'' +
                ", Дата рождения: " + localDate +
                '}';
    }
}
