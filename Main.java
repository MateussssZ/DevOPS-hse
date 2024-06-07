import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name,surname and patronymic: ");
        String surname = in.next();
        String name = in.next();
        String patronymic = in.next();
        System.out.println("Enter your birthdate in the next format: dd.mm.yyyy: ");
        String birthdate = in.next();
        Person person1 = new Person(name,surname, patronymic,birthdate);
        person1.printInfo();
        int veryveryveryveryverybadvariablename=1;
        int veryveryveryveryverybadvariablename2=1;
        System.out.println(veryveryveryveryverybadvariablename);
    }
}