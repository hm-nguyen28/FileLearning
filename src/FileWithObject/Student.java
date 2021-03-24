package FileWithObject;

import java.io.Serializable;

public class Student implements Serializable {
  private String name;
  private int age;
  private String ID;
  private double mark;

  public Student() {
  }

  public Student(String name, int age, String ID, double mark) {
    this.name = name;
    this.age = age;
    this.ID = ID;
    this.mark = mark;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public double getMark() {
    return mark;
  }

  public void setMark(double mark) {
    this.mark = mark;
  }

  @Override
  public String toString() {
    return "Student{" +
        "Name='" + name + '\'' +
        ", Age=" + age +
        ", ID='" + ID + '\'' +
        ", Mark=" + mark +
        '}';
  }
}
