package company.beans;

import company.exceptions.InvalidAgeException;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) throws InvalidAgeException {
    if (age < 0 || age > 125) {
      throw new InvalidAgeException("Invalid age: " + age);
    }
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}