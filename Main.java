import company.beans.Person;
import company.exceptions.InvalidAgeException;

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

  }
}