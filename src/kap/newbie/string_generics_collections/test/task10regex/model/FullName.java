package kap.newbie.string_generics_collections.test.task10regex.model;

/**
 * @author Alexandr Korovkin
 */
public class FullName {
    public static final String NAME_FORMAT = "%s %s %s";
    private String firstName;
    private String secondName;
    private String surname;

    public FullName() {
        this("","","");
    }

    public FullName(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format(NAME_FORMAT, secondName, firstName, surname);
    }
}
