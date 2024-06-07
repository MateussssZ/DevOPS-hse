import java.io.IOException;

public class Person { //Person-class
    private String name;
    private String surname;
    private String patronymic;
    private Birthdate birthdate;
    private String gender;

    public Person(String name, String surname, String patronymic, String date) throws IOException {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthdate = new Birthdate(date);
        if (this.patronymic.substring(this.patronymic.length() - 1).equals("a")) {
            this.gender = "Female";
        } else {
            this.gender = "Male";
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void printInfo() {
        System.out.println("NSP: " + getSurname() + " " + getName() + " " + getPatronymic()
                + "\nAge: " + this.birthdate.countAge()
                + "\nGender: " + getGender());
    }
}
