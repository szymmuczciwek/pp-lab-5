import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
  public static void main(String[] args) {

    try {
      Person person1 = new Person("John", 130);
      System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }

    try {
      Person person2 = new Person("John", 125);
      System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }

    EmailMessenger emailMessenger = new EmailMessenger();

    Integer j = MathUtils.add(4, 6);
    System.out.println(j);

    emailMessenger.sendMessage("Sum of two numbers is: " + j.toString());

    Person[] people = new Person[5];

    final Integer b = 10;

    for (int i = 0; i < 5; i++) {
      try {
        people[i] = new Person("Random Person number: " + Integer.toString(i), 12 * (i + 1));
      } catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
      }
    }

    for (Person person : people) {
      emailMessenger.sendMessage(person.getName() + " calculated number is " + person.getAge() * b);
    }

  }
}