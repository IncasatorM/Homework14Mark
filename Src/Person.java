public class Person {
    String firstName;
    String lastName;
    String city;
    String telephone;




    public Person(String firstName, String lastName, String city, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.telephone = telephone;


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
