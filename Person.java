/*
Implement a superclass Person. Make two classes, Student and Instructor, that
inherit from Person. A person has a name and a year of birth. A student has a
major, and an instructor has a salary. Write the class declarations, the
constructors, and the methods toString for all classes. Supply a test program
for these classes and methods.
 */
public class Person {
    protected String name ;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
