import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваши фамилию, имя и отчество: ");
        String surname = in.next();
        String name = in.next();
        String patronymic = in.next();
        System.out.println("Введите дату вашего рождения в формате дд.мм.гггг: ");
        String birthdate = in.next();
        Person person1 = new Person(name,surname, patronymic,birthdate);
        person1.printInfo();
        int veryveryveryveryverybadvariablename=1;
        int veryveryveryveryverybadvariablename2=1;
        System.out.println(veryveryveryveryverybadvariablename);
    }
}