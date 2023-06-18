import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {


        Person person1 = new Person(" Will ", " Smith ", "New York", "2936729462846.");
        Person person2 = new Person(" Jackie ", " Chan ", " Shanghai ", "12312412412.");
        Person person3 = new Person(" Sherlock ", " Holmes ", " London ", "37742123513.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число від 1 до 3");
        while (true) {
            personInfo();
            int d = sc.nextInt();
            System.out.println(d);
            switch (d) {
                case 1:
                    System.out.println(" Зателефонуйте громадянові " + person1.firstName + person1.lastName + " із міста " + person1.city + " можна за номером " + person1.telephone);
                    break;
                case 2:
                    System.out.println(" Зателефонуйте громадянові " + person2.firstName + person2.lastName + " із міста " + person2.city + " можна за номером " + person2.telephone);
                    break;
                case 3:
                    System.out.println(" Зателефонуйте громадянові " + person3.firstName + person3.lastName + " із міста " + person3.city + " можна за номером " + person3.telephone);
                    break;


                default:
                    System.out.println(" Інформація відсутня ");

                    return;
            }

        }

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);

    }

    public static void personInfo() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
